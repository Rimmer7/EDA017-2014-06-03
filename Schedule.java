import java.util.ArrayList;
import java.util.Scanner;

public class Schedule {
	private String name;
	private ArrayList<Integer> times;
	
	/** Skapar en ny lektionslista med givet namn och läser in ett antal
	lektionstider från den Scanner som ges som parameter. I inläsningen
	anges lektionstiderna som en följd av heltal, avslutad av talet 0. */
	public Schedule(String name, Scanner scan) {
		times = new ArrayList<Integer>();
		
		int time = scan.nextInt();
		while(time != 0) {
			times.add(time);
		}
		sortTimes();
	}
	
	private void sortTimes(){
		// Failsafe for index.
		if(times.size() < 2) {
			return;
		}
		
		// Bubblesort.
		boolean sorted = true;
		do {
			sorted = true;
			for (int i = 1; i < times.size(); i++) {
				if(times.get(i) < times.get(i - 1)) {
					int swap = times.set(i - 1, times.get(i));
					times.set(i, swap);
					sorted = false;
				}
			}
		} while(!sorted);
	}
	
	public String getName() {
		return name;
	}
	
	/** Returnerar namn följt av tider i stigande ordning. Ex: "LabbA: 213 310 414" */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + ":");
		for(int time : times) {
			sb.append(" " + time);
		}
		return sb.toString();
	}
	
	/** Kollar om nuvarande schema innehåller alla tider som finns i schemat 'other' */
	public boolean containsAll(Schedule other) {
		for(int time : times) {
			if(!other.toString().contains(Integer.toString(time))) {
				return false;
			}
		}
		return true;
	}
}

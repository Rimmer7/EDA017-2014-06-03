public class Schedule() {
	private String name;
	private ArrayList<Integer> times;

	/** Skapar en ny lektionslista med givet namn och läser in ett antal
	lektionstider från den Scanner som ges som parameter. I inläsningen
	anges lektionstiderna som en följd av heltal, avslutad av talet 0. */
	public Schedule(String name, Scanner scan) {
		this.name = name;
		times = new ArrayList<Integer>();
		
		int time = scan.nextInt();
		while(time != 0) {
			times.add(time);
		}
		sortTimes();
	}
	
	private static sortTimes(){
		do {
			boolean sorted = true;
			for (int i = 1; i < times.size(); i++) {
				if(times.get(i) < times.get(i - 1) {
					times.add(i - 1, times.get(i));
					sorted = false;
				}
			}
		} while(!sorted)
	}
	
}

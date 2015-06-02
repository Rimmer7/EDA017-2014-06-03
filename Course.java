import java.util.ArrayList;

public class Course {
	private ArrayList<Schedule> labGroups;
	private ArrayList<Schedule> tutors;
	
	/** Skapar ett Course-objekt utan några labbgrupps- eller handledartider. */
	public Course() {
		labGroups = new ArrayList<Schedule>();
		tutors = new ArrayList<Schedule>();
	}
	
	/** Lägger till en labbgrupps tider. */
	public void addLab(Schedule s) {
		labGroups.add(s);
	}
	
	/** Lägger till en handledares möjliga arbetstider. */
	public void addTutor(Schedule s) {
		tutors.add(s);
	}
	
	/** Skriver ut alla labbgrupper. För varje labbgrupp skrivs namnen på de
	handledare som har möjlighet att handleda gruppen ut. */
	public void printCandidates() {
		StringBuilder sb = new StringBuilder();
		for(Schedule group : labGroups) {
			sb.append(group);
			for(Schedule tutor : tutors) {
				if(group.containsAll(tutor)) {
					sb.append("\n  " + tutor.getName());
				}
			}
		}
		System.out.println(sb.toString());
	}
}

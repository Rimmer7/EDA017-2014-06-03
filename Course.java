public class Course() {
	private ArrayList<Schedule> labGroups;
	private ArrayList<Schedule> tutors;
	
	public Course() {
		labGroups = new ArrayList<Schedule>();
		tutors = new ArrayList<Schedule();
	}
	
	public void addLab(Schedule s) {
		labGroups.add(s);
	}
	
	public void addTutor(Schedule s) {
		tutors.add(s);
	}
	
	public void printCandidates() {
		StringBuilder sb = new StringBuilder();
		for(group : labGroups) {
			sb.append(group);
			for(tutor : tutors) {
				if(group.containsAll(tutor)) {
					sb.append("\n  " + tutor.getName());
				}
			}
		}
		System.out.println(sb.toString());
	}
}

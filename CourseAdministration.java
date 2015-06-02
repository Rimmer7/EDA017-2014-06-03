public class CourseAdministration() {
	private Scanner scan;
	private Course course;
	
	public CourseAdministration() {
		scan = new Scanner(System.in);
		course = new Course();
	}
	
	private void printMenu() {
		System.out.println("1. Ny assistent");
		System.out.println("2. Ny labbgrupp");
		System.out.println("3. Skriv ut möjliga assistenter");
		System.out.println("4. Avsluta");
	}
	
	private void addTutor(Schedule s) {
		course.addTutor(s);
	}
	
	private void addLab(Schedule s) {
		course.addLab(s);
	}
	
	private void printCandidates() {
		course.printCandidates();
	}
	
	private void exit() {
		System.exit(0);
	}
	
	private void runApplication() {
		do {
			printMenu();
			System.out.print("val: ")
			int option = scan.nextInt();
			
			switch(option) {
				case 1:	System.out.print("Ny assistent: ");
					String name = scan.next();
					Schedule s = new Schedule(name, scan);
					addTutor(s);
					break;
				case 2:	System.out.print("Ny labb: ");
					String name = scan.next();
					Schedule s = new Schedule(name, scan);
					addLab(s);
					break;
				case 3:	printCandidates();
					break;
				case 4:	exit();
				default: break;
			}
		} while (true)
	}
	
	public static void main(String args[]) {
		CourseAdministration app = new CourseAdministration();
		app.runApplication();
	}
}

import java.util.Scanner;


public class CourseAdministration {
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
	
	private void addTutor() {
		System.out.print("Ny assistent: ");
		String name = scan.next();
		Schedule s = new Schedule(name, scan);
		course.addTutor(s);
	}
	
	private void addLab() {
		System.out.print("Ny labb: ");
		String name = scan.next();
		Schedule s = new Schedule(name, scan);
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
			System.out.print("val: ");
			int option = scan.nextInt();
			
			switch(option) {
				case 1:
					addTutor();
					break;
				case 2:
					addLab();
					break;
				case 3:
					printCandidates();
					break;
				case 4:
					exit();
				default:
					break;
			}
		} while (true);
	}
	
	public static void main(String args[]) {
		CourseAdministration app = new CourseAdministration();
		app.runApplication();
	}
}

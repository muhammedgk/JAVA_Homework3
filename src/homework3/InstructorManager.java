package homework3;

public class InstructorManager extends UserManager {
	public void add(User instructor) {
		System.out.println("Eðitmen olarak eklendiniz : "+instructor.getFirstname());
	}
	
	public void courseName(String courseName) {
		System.out.println("Eðitmen olarak "+courseName+ " kursuna kaydoldunuz");
	}

}

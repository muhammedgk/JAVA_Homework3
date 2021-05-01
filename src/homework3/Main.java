package homework3;

public class Main {

	public static void main(String[] args) {
		//User user = new User();
		Student student = new Student();
		Instructor instructor  = new Instructor();
		instructor.setFirstname("Engin");
		instructor.setLessonName("JAVA");
		student.setId(1);
		student.setFirstname("Muhammed");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.courseSelect("JAVA");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.courseName(instructor.getLessonName());
	}

}

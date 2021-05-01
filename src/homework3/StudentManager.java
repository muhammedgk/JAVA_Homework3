package homework3;

public class StudentManager extends UserManager{
	@Override
	public void add(User student) {
		System.out.println("Öðreci sisteme eklendi : "+student.getFirstname());
	}
	

	
	  public void courseSelect(String course) {
	  System.out.println("Kurs eklendi :"+course);
	  
	  }
	 

}

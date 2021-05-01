package homework3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kiþi eklendi :"+user.getFirstname());
	}
	public void delete(User user) {
		System.out.println("Kiþi silindi :"+user.getFirstname());
	}

}

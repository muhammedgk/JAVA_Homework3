package homework3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Ki�i eklendi :"+user.getFirstname());
	}
	public void delete(User user) {
		System.out.println("Ki�i silindi :"+user.getFirstname());
	}

}

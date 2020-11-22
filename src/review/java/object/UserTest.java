package review.java.object;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User one = new User("Lucy","123456");
		User two = new User("Mike","123456");
		
		UserManager userManager = new UserManager();
		String res = userManager.checkUser(one, two);
		System.out.println(res);
		
		
		
		

	}

}

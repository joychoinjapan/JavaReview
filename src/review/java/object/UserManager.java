package review.java.object;

public class UserManager {
	public String checkUser(User one,User two) {
		
		if(one.getUserName()!=two.getUserName()
				||one.getPassWord()!=two.getPassWord()) {
			return "用户名或密码不一致";
		}else {
			return "用户名和密码一致";
		}

	}
	
	
	
	
	

}

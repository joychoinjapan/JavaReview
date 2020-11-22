package review.java.test;
import review.java.school.*;

public class TestSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subject subject = new Subject("计算机", "0001", 4);
		
		Student student = new Student("0003","张三","女",2);
		System.out.println(student.introduction(subject));
		System.out.println(student.introduction());

	}

}

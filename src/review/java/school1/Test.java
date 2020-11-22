package review.java.school1;

import review.java.school1.Student;
import review.java.school1.Subject;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject("计算机", "0001", 4);
		
		Student student = new Student("0003","张三","女",2,subject);
		subject.addStudent(student);
		System.out.println(student.introduction());
		System.out.println("=====================");
		System.out.println(student.info());
		System.out.println(student.getSubject().getStudentsNum());

	}

}

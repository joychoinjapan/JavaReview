package review.java.school1;

public class Student {
	//成员属性：学号，姓名，性别，年龄
	private String studentNo;
	private String studentName;
	private String gender;
	private int age;
	private Subject subject;
	
	
	

	public Student() {
		
	}
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		if(this.subject == null) {
			this.subject = new Subject();
		}
		this.subject = subject;
	}
	
	public Student(String studentNo, String studentName, String gender, int age,Subject subject) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.gender = gender;
		this.setAge(age);
		this.setSubject(subject);
	}
	
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<10||age>100) {
			this.age =18;
		}else {
			this.age = age;
		}
		
	}
	
	public String introduction(){
		String info= "学生信息如下:\n"+"姓名:"+this.getStudentName()
	+"\n学号"+this.getStudentNo()+"\n性别"+this.getGender()+"\n年龄"+this.getAge();
		return info;
		
	}
	
	/**
	 * 学科信息的方法
	 * @param subject
	 * @return 学科信息
	 */
	public String info() {
		String info ="专业信息如下:\n专业名称"+this.subject.getSubjectName()
		+"\n学科编号:"+this.subject.getSubjectNo()+"\n学制年限:"+this.subject.getSubjectLife();
		return info;	
	}

	

	
	
	
 
}

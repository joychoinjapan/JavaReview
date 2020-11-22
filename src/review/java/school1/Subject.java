package review.java.school1;

public class Subject {
	
	//学科名称，学科编号，学制年限，报名选修的学生信息,和报名选修的成员个数
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentsNum;
	
	public Subject(){
		
	}

	//带参构造，实现对学科名称，编号，学制年限的赋值
	public  Subject(String subjectName,String subjectNo,int subjectLife,Student[] myStudents){
		this.subjectName = subjectName;
		this.subjectNo = subjectNo;
		this.subjectLife = subjectLife;
		this.setMyStudents(myStudents);
		
	}
	
	//带参构造，实现对学科名称，编号，学制年限,学科容纳学生人数全赋值
		public  Subject(String subjectName,String subjectNo,int subjectLife){
			this.subjectName = subjectName;
			this.subjectNo = subjectNo;
			this.subjectLife = subjectLife;
			
		}
	
	public Student[] getMyStudents() {
		if(this.myStudents==null) {
			this.myStudents = new Student[200];
		}
		return myStudents;
	}


	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}


	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectNo() {
		return subjectNo;
	}
	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}
	public int getSubjectLife() {
		return subjectLife;
	}
	
	public int getStudentsNum() {
		return studentsNum;
	}

	public void setStudentsNum(int studentsNum) {
		this.studentsNum = studentsNum;
	}

	//设置年限
	public void setSubjectLife(int subjectLife) {
		if(subjectLife<=0)
			return;
		this.subjectLife = subjectLife;
	}
	
	public String info() {
		String str ="专业信息如下:\n专业名称"+this.getSubjectName()
		+"\n学科编号:"+this.getSubjectNo()+"\n学制年限:"+this.getSubjectLife();
		return str;
	}
	
	/**
	 * 添加学生
	 * @param stu
	 */
	public void addStudent(Student stu) {
		/**
		 * 1.将学生保存至数组
		 * 2.保存学生个数
		 */
		for(int i = 0;i<this.getMyStudents().length;i++) {
			if(this.getMyStudents()[i] == null) {
				this.getMyStudents()[i] =  stu;
				this.studentsNum = i+1;
				return;
			}
		}
		
	}

}

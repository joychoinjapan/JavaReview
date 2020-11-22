package review.java.school;

public class Subject {
	
	//学科名称，学科编号，学制年限
	private String subjectName;
	private String subjectNo;
	private int subjectLife;

	
	public  Subject(String subjectName,String subjectNo,int subjectLife){
		this.subjectName = subjectName;
		this.subjectNo = subjectNo;
		this.subjectLife = subjectLife;
		
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

}

package review.java.job;

public class TestWork extends Work {
	private int cases_number;
	private int bugs_number;
	
	
	public TestWork(String name) {
		this.setName(name);
		
	}



	public int getCases_number() {
		return cases_number;
	}



	public void setCases_number(int cases_number) {
		this.cases_number = cases_number;
	}



	public int getBugs_number() {
		return bugs_number;
	}



	public void setBugs_number(int bugs_number) {
		this.bugs_number = bugs_number;
	}



	public String work() {
		return this.getName()+"工作的日报是:"+"今天编写了"+this.getCases_number()+"个测试用例,"+"目前发现了"+this.getBugs_number()+"个bug";

	}

}

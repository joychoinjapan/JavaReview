package review.java.job;

public class DevelopmentWork extends Work{
	
	private int lines;
	private int bug_numbers;
	
	public DevelopmentWork(String name) {
		this.setName(name);
	}

	public int getLines() {
		return lines;
	}



	public void setLines(int lines) {
		this.lines = lines;
	}



	public int getBug_numbers() {
		return bug_numbers;
	}



	public void setBug_numbers(int bug_numbers) {
		this.bug_numbers = bug_numbers;
	}



	public String work() {
		
		return this.getName()+"工作的日报是:"+"今天编写了"+this.getLines()+"行代码,"+"目前仍有"+this.getBug_numbers()+"个bug没有解决";
		
	}
}

package review.java.job;

public class Work {
	private String name;
	
	public Work() {
		
	}
	
	public Work(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String work() {
		return "开心工作";
	}
	
	
	
	

}

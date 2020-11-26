package review.java.job;

public class Test {
	public static void main(String[] args) {
		
		System.out.print("父类信息测试：");
		System.out.println(new Work().work());
		
		TestWork testWork = new TestWork("测试");
		testWork.setCases_number(10);
		testWork.setBugs_number(5);
		DevelopmentWork developmentwork = new DevelopmentWork("研发");
		developmentwork.setLines(1000);
		developmentwork.setBug_numbers(10);
		
		
		System.out.print("测试工作类信息测试：");
		System.out.println(testWork.work());
	
		System.out.print("研发工作类信息测试：");
		System.out.println(developmentwork.work());
		
	}

}

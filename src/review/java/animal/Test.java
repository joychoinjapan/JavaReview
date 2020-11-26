package review.java.animal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat one = new  Cat();
		one.setName("花花");
		one.setMonth(1);
		one.setSpecie("中华田园猫");
		one.eat();
		one.run();
		System.out.println(one.temp);
		
		Dog two = new Dog();
		two.setName("gogo");
		two.setMonth(10);
		two.setSpecie("金毛");
		two.eat("狗粮");
		two.sleep();
		

	}

}

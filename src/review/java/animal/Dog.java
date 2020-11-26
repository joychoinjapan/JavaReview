package review.java.animal;

public class Dog extends Animal {
	private String sex;
	
	public Dog() {
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//睡觉的方法
	public void sleep() {
		System.out.println(this.getName()+"现在"+this.getMonth()+"个月大，他在睡觉");
	}
	
	//方法重写 返回值类型，方法名，参数必须完全一致
	//有继承关系的类中
	//访问修饰符
	public void eat() {
		System.out.println(this.getName()+"没有食欲");
	}
	
	public void eat(String food) {
		System.out.println(this.getName()+"正在吃"+food+",它吃的很香");
	}
	
	
	
	
	
	
	
	
	
}

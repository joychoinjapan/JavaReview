package review.java.animal;

public class Cat extends Animal{
	private double weight;//体重
	//属性被重写
	public int temp = 300;
	public static int st3 = 44;
	
	static {
		System.out.println("我是子类的静态代码块");
	}
	
	{
		System.out.println("我是子类的构造代码块");
	}
	
	public Cat() {
		//子类构造默认调用父类的无参构造方法
		System.out.println("我是子类的无参构造方法");

	}
	
	public Cat(String name,int month) {
		//调用父类的双参构造方法
		super(name,month);
		
		//子类构造默认调用父类的无参构造方法
		//System.out.println("我是子类的带参构造方法111");
		
		
		
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void run() {
		System.out.println(this.getMonth()+"个月大的"+this.getName()+"在奔跑");
	}
	
    @Override
    public void eat() {
    	// TODO Auto-generated method stub
    	super.eat();
    }
	
	

}

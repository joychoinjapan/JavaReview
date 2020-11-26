package review.java.animal;

/**
 * 动物的父类
 * @author baobaochu
 *
 */
public class Animal {
	
	private String name = "nini";
	private int month = 3;
	private String specie = "布偶猫";//品种
	
	private static int st1 = 22;
	public static int st2 =23;
	
	//重写属性
	public int temp=15;
	
	//父类的构造不允许被继承，不允许被重写，但会影响子类对象的实例化
	public Animal() {
		System.out.println("我是父类的无参构造方法");
	}
	public Animal(String name,int month) {
		this.name = name;
		this.month = month;
		System.out.println("我是父类的带参构造方法111");
		
	}
	
	static {
		System.out.println("我是父类的静态代码块");
	}
	
	{
		System.out.println("我是父类的构造代码块");
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}
	
	public void eat() {
		System.out.println(this.getName()+"在吃东西");
	}
	
	public void eat(String food) {
		System.out.println(this.getName()+"正在吃"+food);
	}
	
	//重写object方法1
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		Animal temp = (Animal)obj;
		boolean name_flag = this.getName().equals(temp.getName());
		boolean age_flag = this.getMonth()== temp.getMonth();
				
		return name_flag&&age_flag;
					
	}
	
	//重写object方法2防止类型变化异常报错
	public boolean equals(Animal obj) {
		if(obj == null) {
			return false;
		}
		
		boolean name_flag = this.getName().equals(obj.getName());
		boolean age_flag = this.getMonth()== obj.getMonth();
				
		return name_flag&&age_flag;
					
	}

}

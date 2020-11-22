package review.java.object;

/**
 * pet cats
 * @author baobaochu
 *
 */


public class Cat {
	//属性：昵称，年龄，体重，品种
	private String name;//String类型 默认值null
	private int month;//int年龄 默认值0
	private double weight;//double体重 默认值0,0
	private String species;//String类型 默认值0
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	//对属性添加限定
	public void setMonth(int month) {
		if(month<=0) {
			System.out.println("输入信息错误，宠物猫的年龄需要大于0");
		}
		else
			this.month = month;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	//方法:跑动，吃东西
	public void run() {
		System.out.println("run");
	}
	
	//方法重载，载入参数
	public void run(String name) {
		System.out.println(name+" is running");
	}
	
	public void eat() {
		System.out.println("eat");
	}
}

package review.java.singleton;

public class SingletonOne {
	//1.创建私有构造
	private SingletonOne() {
		
	}
	
	//2.创建私有静态实例
	private static SingletonOne instance = new SingletonOne();
	
	//创建共有静态方法返回实例对象
	public static SingletonOne getInstance() {
		return instance;
	}
	
	

}

package review.java.singleton;

public class SingletonTwo {
	//1.创建私有构造方法
		private SingletonTwo() {
			
		}
		
		//2.创建私有静态实例
		private static SingletonTwo instance = null;
		
		//创建开放静态方法返回实例对象
		public static SingletonTwo getInstance() {
			if(instance == null) {
				instance = new SingletonTwo();
			}
			
			return instance;
		}

}

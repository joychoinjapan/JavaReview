package review.java.method;

//生成文档的命令:javadoc -d doc ArgsDemo3.java

/**
 * 关于可变参数列表和重载的问题
 * @author baobaochu
 * @version 1.0
 */
public class ArgsDemo3 {

	/**
	 * 主方法
	 * @param args
	 * @version 1.0
	 */
	public static void main(String[] args) {
		ArgsDemo3 argsDemo3 = new ArgsDemo3();
		//可变参数列表所在的方法是最后被访问的
		int res_1 = argsDemo3.plus(1,2);
		
	}
	
	/**
	 * 不带可变参数的方法
	 * @param a
	 * @param b
	 * @return
	 */
	public int plus(int a,int b) {
		System.out.println("不带可变参数的方法被调用");
		return a+b;
		
	}
	
	/**
	 * 带可变参数的方法被调用
	 * @param a
	 * @return
	 */
	public int plus(int...a) {
		int sum = 0;
		for(int n:a) {
			sum = sum+n;
		}
		System.out.println("带可变参数的方法被调用");
		return sum;
	}

}

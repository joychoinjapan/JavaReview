package review.java.method;

public class MethodDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo3 myMethodDemo3 = new MethodDemo3();
		myMethodDemo3.max(9.0f, 9.00f);

	}
	
	//求两个float类型数据最大值的方法 //带参数 无返回值
	public void max(float x ,float y) {
		float max ;
		max = x>y?x:y;
		System.out.println("max number is:"+max);
	}

}

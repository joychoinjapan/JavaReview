package review.java.method;

public class MethodDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo2 myDemo2 = new MethodDemo2();
		int res = myDemo2.area();
		System.out.println(res);
		

	}
	
   //无参数带返回值
	public int area(){
		int length = 10;
		int width = 5;
		int area = length*width;
		return area;
	}

}

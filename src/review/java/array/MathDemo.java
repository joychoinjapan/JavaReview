package review.java.array;


public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=5,n=10;
		int[] arr = {1,2,3,4,5};
		MathDemo mathDemo = new MathDemo();
		int res1 = mathDemo.plus(m,n);
		double res2 = mathDemo.plus(4.5,3.4);
		int res3 = mathDemo.plus(arr);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);


	}
	
	//求两个int类型数的和
	public int plus(int m,int n) {
		return m+n;
	}
	//求两个double类型数的和
	public double plus(double m,double n) {
		return m+n;
	}
	
	//求数组元素的累加和
	public int plus(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum +arr[i];
		}
		return sum;
	}
	

}

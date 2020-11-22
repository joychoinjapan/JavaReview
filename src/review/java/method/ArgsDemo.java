package review.java.method;

public class ArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsDemo aDemo =new ArgsDemo();
		aDemo.sum(1,2,3,4);
		aDemo.search(3, 3,4,5,6);
		int[] a= {1,2,3,4};
		aDemo.search(7, a);
	}
	
	//求和
	//不限定参数数量，以下表示代入任意个int类型的参数
	public void sum(int...n) {
		int sum = 0;
		for(int i:n) {
			sum = sum +i;			
		}
		System.out.println("sum="+sum);
	}
	
	public void search(int n,int... a) {
		boolean flag = false;
		for( int a1:a) {
			if(a1 == n) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("找到了:"+n);
		}else {
			System.out.println("没找到");
		}
		
	}

}

package review.java.array;

public class ExchangeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 2,n =4;
		ExchangeDemo exchangeDemo = new ExchangeDemo();
		exchangeDemo.swap(m,n);
		//即使调用了数据，外部数据还是不变的
		//2,4
		System.out.println("m ="+m+",n="+n);
		
		

	}
	
	//交换的方法
	public void swap(int a ,int b) {
		int temp;
		System.out.println("a ="+a+",b="+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("a ="+a+",b="+b);	
	}

}

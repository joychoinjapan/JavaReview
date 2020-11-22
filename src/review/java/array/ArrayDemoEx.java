package review.java.array;

public class ArrayDemoEx {

	public static void main(String[] args) {
		//求数组中能被3整除的元素并打印输出。
		
		//定义一个整型数组，并初始化
		int[] numbers = {2,4,6,7,0,34,12,99};
		
		//循环遍历数组，找出能被3整除的元素并打印输出
		for( int i = 0;i<numbers.length;i++) {
			if(numbers[i]%3 == 0) {
				System.out.println(numbers[i]);
			}
		}
		

	}

}

package review.java.method;

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMethod arrayMethod=new ArrayMethod();
		int[] arr = {1,3,4,5};
		arrayMethod.printArray(arr);
		

	}
	
	//打印输出数组元素的值
	public void printArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
	}

}

package review.java.array;

public class ArrayDeomo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明一个整型数组
		int[] intArray;
		//声明一个字符串类型的数组
		String strArray[];
		//创建数组
		intArray = new int[5];
		strArray = new String[10];
		//声明数组的同时创建
		float[] floatArray = new float[4];
		
		//初始化数组
		char[] ch = {'a','b','c','d','e'};
		System.out.println("ch的长度为:"+ch.length);
		System.out.println(intArray[2]);//0
		System.out.println(strArray[2]);//null
		System.out.println(floatArray[floatArray.length-1]);//0.0

		//循环为整型数组赋值
		for(int i=0;i<5;i++) {
			intArray[i] =i+1;
		}
		
		//循环输出整型数组
		for(int i =0;i<5;i++) {
			System.out.print(intArray[i]+" ");
		}
		
	
		
	
		
		
		

	}

}

package review.java.array;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明一个二维数组
		//三种形式
		//声明int 类型的而为数组
		 int[][] intArray;
		 float floatArray[][];
		 double[] doubleArray[];
		 //创建一个三行三列的int 数组
		 intArray = new int[3][3];
		 System.out.println("intArray数组的第三行第二列的元素为:"+intArray[2][1]);
		 //为第二行第三个元素赋值为九;
		 intArray[1][2] = 9;
		 
		 //创建float类型的数组，只指定行数
		 //且必须指定行数
		 floatArray = new float[3][];
		 
		 //每行数组的创建,里面有N个元素
		 floatArray[0] = new float[3];
		 floatArray[1] = new float[4];
		 floatArray[2] = new float[5];
		 
		 System.out.println(floatArray[1][2]);
		 
		 //二维数组的初始化
		 int[][] num = {{1},{2,3,4},{3,4},{3,3,4}};
		 System.out.println(num[0][0]);
		 System.out.println(num[0].length);
		 
	}

}

package review.java.array;

import java.util.Scanner;

public class ForEachArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//foreach的用法
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		for(int i =0;i<array.length;i++) {
			System.out.println("请输入第"+(i+1)+"个元素:");
			array[i] = scanner.nextInt();	
		}
		for (int item : array) {
			System.out.print(item+ " ");
		}

	}

}

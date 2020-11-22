package review.java.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求整型数组的累加和
		int[] a = new int[5];
		Scanner scanner = new Scanner(System.in);
		for(int i =0;i<a.length;i++) {
			System.out.println("请输入第"+(i+1)+"个元素:");
			a[i] = scanner.nextInt();	
		}
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
		

	}

}

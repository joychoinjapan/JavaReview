package review.java.array;

import java.awt.image.RescaleOp;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//查找数组元素值的方法
		ArraySearch arraySearch = new ArraySearch();
		int n=1;
		int[] arr = {1,3,4};
		boolean res = arraySearch.search(n, arr);
		System.out.println(res);
		
		

	}
	
	public boolean search(int n,int[] arr) {
		boolean flag = false;
		for(int i:arr) {
			if(i==n) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}

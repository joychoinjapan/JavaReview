package review.java;

import java.util.Scanner;

public class WeekDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入1-7之间的数字:");
		//int n = scanner.nextInt();
		//输入字符串的话用下面的
		String week = scanner.next();
		switch (week) {
			case "1": {
				System.out.print("星期一");
				break;
			}
			case "2": {
				System.out.print("星期二");
				break;
			}
			case "3": {
				System.out.print("星期三");
				break;
			}
			case "4": {
				System.out.print("星期四");
				break;
			}
			case "5": {
				System.out.print("星期五");
				break;
			}
			case "6": {
				System.out.print("星期六");
				break;
			}
			case "7": {
				System.out.print("星期天");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + week);
			}
		

	}

}

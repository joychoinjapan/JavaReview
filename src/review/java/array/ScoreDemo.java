package review.java.array;

import java.util.Scanner;

public class ScoreDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int sum_yuwen = 0;
		int sum_shuxue = 0;
		int[][] scores=new int[3][2];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i < scores.length ;i++) {
			System.out.println("请输入第"+(i+1)+"个学生的语文成绩:");
			scores[i][0]=scanner.nextInt();
			System.out.println("请输入第"+(i+1)+"个学生的数学成绩:");
			scores[i][1]=scanner.nextInt();
			sum_yuwen = sum_yuwen+scores[i][0];
			sum_shuxue = sum_shuxue+scores[i][1];
		}
		System.out.println("语文的总成绩为"+sum_yuwen);
		System.out.println("语文的平均分为"+sum_yuwen/scores.length);
		System.out.println("数学的总成绩为"+sum_shuxue);
		System.out.println("数学的平均分为"+sum_shuxue/scores.length);

	}

}

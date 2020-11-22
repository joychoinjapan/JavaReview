package review.java.method;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		MethodDemo myMethodDemo = new MethodDemo();
		myMethodDemo.printStar();
		System.out.println("欢迎!");
		myMethodDemo.printStar();
		
	}	
	public void printStar() {
		System.out.println("****************");
	}

}

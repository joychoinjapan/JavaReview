package review.java.animal;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal one = new Animal("花花",2);
		Animal two = new Animal("花花",2);
		boolean flag = one.equals(two);//重写方法之后变成了true此时采用的是方法2 public boolean equals(Animal obj)
		System.out.println(flag);
		System.out.println(one == two);
		String str1 = new String("hello");
		String str2 = new String("hello");
		boolean flag1 = str1.equals(str2);
		System.out.println(flag1);//true
		System.out.println(str1 == str2);//false
		String str3 = "gogo";
		String str4 = "gogo";
		System.out.println("========");//false
		System.out.println(str3 == str4);//true

		

	}

}

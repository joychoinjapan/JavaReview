package review.java.method;

public class Discount {

	public static void main(String[] args) {
		//定义对象
		Discount myDiscount = new Discount();
		System.out.println(myDiscount.checkout(150));
	}
	
	public double checkout(double total) {
		if(total>=200) {
			total = total * 0.85;
		}
		
		if(total>=100 && total<200) {
			total = total * 0.95;
		}
		
		return total;

	}
}

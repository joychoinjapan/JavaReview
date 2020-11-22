package review.java.method;


public class AvgDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] array = {78.5f,98.5f,65.5f,32.5f,75.5f};
		
		AvgDemo avgDemo=new AvgDemo();
		System.out.println(avgDemo.func(array));
	}
	
	public float func(float[] array) {
		float sum = 0f;
		for(float i:array){
			sum = sum + i ;
		}
		
		
		return sum/array.length;
	}

}

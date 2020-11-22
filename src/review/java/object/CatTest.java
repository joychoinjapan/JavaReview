package review.java.object;


public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat_1 = new Cat(); 
		cat_1.eat();
		cat_1.run("球球");
		cat_1.setName("花花") ;
		cat_1.setMonth(-2);
		cat_1.setWeight(1000);
		cat_1.setSpecies("英国短毛猫");
		System.out.println("name:"+cat_1.getName());
		System.out.println("month:"+cat_1.getMonth());
		System.out.println("weight:"+cat_1.getWeight());
		System.out.println("specied:"+cat_1.getSpecies());
		

	}

}

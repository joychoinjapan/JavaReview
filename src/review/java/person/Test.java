package review.java.person;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("李明", 18,"男");
		System.out.println("姓名:"+person.getName()+"年龄:"+person.getAge()+"性别:"+person.getSex());
		System.out.println(person.toString());
	
	}

}

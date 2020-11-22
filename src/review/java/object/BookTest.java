package review.java.object;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book_1 = new Book();
		Book book_2 = new Book();
		book_1.setName("红楼梦");
		book_1.setAuthor("曹雪芹");
		book_1.setChubanshe("人民文学出版社");
		book_1.setPrice(0);
		System.out.println(book_1.getName());
		System.out.println(book_1.getAuthor());
		System.out.println(book_1.getChubanshe());
		System.out.println(book_1.getPrice());
		

	}

}

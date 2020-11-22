package review.java.object;


public class Book {
	private double price;
	private String name;
	private String author;
	private String chubanshe;
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<10) {
			this.price = 10;
		}else {
			this.price = price;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChubanshe() {
		return chubanshe;
	}
	public void setChubanshe(String chubanshe) {
		this.chubanshe = chubanshe;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}

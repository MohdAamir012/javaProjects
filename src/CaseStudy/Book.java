package CaseStudy;

public class Book {
	private int bookIsbnNo;
    private String author;
    private String publisher;
    private Float price;
    public Book() {
    	
    }
	public Book(int bookIsbnNo, String author, String publisher, float price) {
		super();
		this.bookIsbnNo = bookIsbnNo;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	public int getBookIsbnNo() {
		return bookIsbnNo;
	}
	public void setBookIsbnNo(int bookIsbnNo) {
		this.bookIsbnNo = bookIsbnNo;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	} 
	public String toString() {
		return bookIsbnNo+"\t"+author+"\t"+publisher+"\t"+price;
	}
}

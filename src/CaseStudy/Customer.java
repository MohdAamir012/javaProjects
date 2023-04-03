package CaseStudy;

import java.util.List;

public class Customer {
	private String customerName;
    private String address;
    private List<Book> borrowed;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(String customerName, String address, List<Book> borrowed) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.borrowed = borrowed;
	}
	public List<Book> getBorrowed() {
		return borrowed;
	}
	public void setBorrowed(List<Book> borrowed) {
		this.borrowed = borrowed;
	}
	public String toString() {
		return customerName+"\t"+address+"\t"+borrowed;
	}
}

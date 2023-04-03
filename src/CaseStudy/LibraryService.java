package CaseStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryService {
	private String libraryName;
	private String address;
	private List<Book> books;// A library has one or more books

	public LibraryService() {
		books=new ArrayList<Book>();
		books.add(new Book(101, "Saurabh sir", "Arihant Books.", 400.5f));
		books.add(new Book(111, "Farhan sir", "Jaico Publishing House", 200.2f));
		books.add(new Book(131, "Neeraj sir", "Rupa Publications", 800.2f));
		books.add(new Book(201, "Shivanshu sir", "Penguin Random House India", 900.2f));
		books.add(new Book(261, "Sid sir", "Roli Books", 1200.2f));
	}

	public List<Book> getBooks() {
		return books;
	}

	public String toString() {
		return libraryName + "\t" + address + "\t" + books;
	}

	public void addBook(Book b) { 
		this.books.add(b);
	}

	public void removeBook(int bookIsbnNo) {

		List <Book> l= books.stream().filter(e->e.getBookIsbnNo()==bookIsbnNo).collect(Collectors.toList());
		if(l.isEmpty())
			System.out.println("Book is not available");
		else
		books.remove(l.get(0));
	}
	public Book findMaxPrice(String publisher) {
//		List <Book> b= books.stream().filter(e->e.getPublisher().equals(publisher)).sorted((e1,e2)->e2.getPrice().compareTo(e1.getPrice())).collect(Collectors.toList());
		List <Book> b=books.stream().filter(e->e.getPublisher().equals(publisher)).sorted((e1,e2)->e2.getPrice().compareTo(e1.getPrice())).collect(Collectors.toList());
				if(b.isEmpty()) {
			System.out.println("No Publisher exist");
		return null;
		}
		else
			return b.get(0);
}
}
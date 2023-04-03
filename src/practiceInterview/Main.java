package practiceInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) { 
		List <Book> l=new ArrayList <Book> ();
//		List <Book> t=new ArrayList <Book> ();
		
		l.add(new Book(101,"Java Beginner","Saurabh sir"));
		l.add(new Book(131,"C++ fundamental","Aamir sir"));
		l.add(new Book(123,"Let us C","Farhan sir"));
		l.add(new Book(161,"Python Beginner","Tushar sir"));
		l.add(new Book(301,"C# Beginner","Sameer sir"));
		l.add(new Book(331,"GO Beginner","Mohsin sir"));
		l.add(new Book(201,"Java Advance","Saurabh sir"));
		
		System.out.println(l.stream().map(e->e.getBook_name()).collect(Collectors.toList()));
		System.out.println(l);
//		t.addAll(l);
//		System.out.println(l);
//		t.add(new Book(21,"PHP","Mukesh sir"));
//		for(Book b:t) {
//			System.out.println(b.getBook_id()+" "+b.getBook_name()+" "+b.getBook_author());
//		}
//		Comparator<Book> by_book_id = (Book o1,Book o2) -> o1.getBook_id()-o2.getBook_id();
		System.out.println("-----------------------------------------------------------");
//		Iterator i = l.iterator();
//		Collections.sort(l,by_book_id);
		 
//		for(Book b:l) {
//			System.out.println(b.getBook_id()+" "+b.getBook_name()+" "+b.getBook_author());
//		}
//		while(i.hasNext()) {
//			System.out.println(i);
//		}
	}

}

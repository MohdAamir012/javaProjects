package CaseStudy;

import java.util.List;
import java.util.Scanner;

public class LibraryHack {

	public static void main(String[] args) {
		
		LibraryService ls =new LibraryService();
		String s;
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Enter the type of user you are ");
			s = sc.next();
		if(s.equals("admin")){
			while(true) {
				int ch;
				System.out.println("Enter the choice ");
				ch = sc.nextInt();
				switch (ch) {
				case 1: {
					List<Book> res1 = ls.getBooks();
					for (Book tmp : res1) {
						System.out.println(tmp);
					}
					break;
				}
				case 2: {
						System.out.println("Enter the bookIsbnNo ");
						int bookIsbnNo=sc.nextInt();
						System.out.println("Enter the Author name ");
						String author=sc.nextLine();
						System.out.println("Enter the publisher name ");
						String publisher=sc.nextLine();
						System.out.println("Enter the price ");
						float price=sc.nextFloat();
						ls.addBook(new Book(bookIsbnNo,author,publisher,price));
						System.out.println("Book added succesfully");
				break;
				}
				case 3: {
					System.out.println("Enter the bookIsbnNo of the book you wanna delete ");
					int bookIsbnNo=sc.nextInt();
					ls.removeBook(bookIsbnNo);
				break;
				}
				case 4: {
					System.out.println("Enter the Publisher of the book ");
					String pub=sc.nextLine();
					sc.nextLine();
					Book b =ls.findMaxPrice(pub);
					if(b==null) {
						System.out.println("publisher doesn't exist ");
					}
					else {
						System.out.println(b);
					}
					break;
				}
				
				}
			}
			}
		else if(s.equals("customer")) {
				System.out.println("Enter the function you want to perform : ");
				int t=sc.nextInt();
				if(t==1) {
					List<Book> res1 = ls.getBooks();
					for (Book tmp : res1) {
						System.out.println(tmp);
					}
				}
				else if(t==2) {
					System.out.println("Enter the Publisher of the book ");
					String pub=sc.next();
					Book b =ls.findMaxPrice(pub);
					if(b==null) {
						System.out.println("publisher doesn't exist ");
					}
					else {
						System.out.println(b);
					}
				}
			}
		else {
			System.out.println("Wrong type !!");
			}
		sc.close();
		}

}

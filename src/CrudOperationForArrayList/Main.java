package CrudOperationForArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> li = new ArrayList<String>();
		Boolean t=true;
		while (t) {
			System.out.println("SELECT THE OPTIONS " + "\n1." + "Insert " + 
								" \n2." + " Search " + "\n3." + " Delete "
								+ "\n4 " + " Display" + "\n5 " + " Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("Enter the string you want to insert ");
				String s = sc.next();
				li.add(s);
				break;
			}
			case 2: {
				System.out.println("Enter the key word you want to search");
				String s = sc.next();
				if (li.contains(s)) {
					System.out.println(s + "is present ");
				} else {
					System.out.println(s + "is not present ");
				}
				break;
			}
			case 3: {
				System.out.println("Enter the key word you want to Delete ");
				String s = sc.next();
				if (li.remove(s)) {
					System.out.println("Item removed ");
				} else {
					System.out.println("Item not present ");
				}
				break;
			}
			case 4: {
				for (String s : li) {
					System.out.println(s);
				}
				break;
			}
			case 5: {
				System.out.println("Going out of the loop");
				if(ch==5)
					t=false;
				break;
				
			}
			}
		}

	}

}

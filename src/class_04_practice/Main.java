package class_04_practice;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<String,String> m=new TreeMap<String,String>();
		m.put("mohdaamir011","Aamir@123");
		m.put("farhan","farhan@123");
		m.put("sid012","Sid@123");
		m.put("tushar01","Tushar@123");
		
		System.out.println("Enter the user name :");
		String s=sc.next();
		
		if(m.containsKey(s)) {
			System.out.println("Enter the user password :");
			String p=sc.next();
			if(m.get(s).equals(p)) {
				System.out.println("Successfully login :");
			}
			else {
				System.out.println("Invalid password !");
			}
			}
			else {
				System.out.println("Invalid id !");
		}
	}

}

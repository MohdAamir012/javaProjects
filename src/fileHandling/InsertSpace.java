package fileHandling;

import java.util.Scanner;

public class InsertSpace {
	public String addSpace(String s) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			ans += s.charAt(i) + " ";
		}
		return ans;
	}

	public static void main(String[] args) {
		LambdaString ls = new InsertSpace()::addSpace;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word in which you want to add space");
		String s = sc.next();

		System.out.println("String after adding space :  " + ls.addingSpace(s));
		sc.close();
	}

}

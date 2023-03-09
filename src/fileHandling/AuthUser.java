package fileHandling;

import java.util.Scanner;

public class AuthUser {

	public boolean verification(String username, String password) {
		if (username.equals("Aamir") && password.equals("Aamir@123"))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x, y;
		Auth auth = new AuthUser()::verification;
		System.out.println("Enter username");
		x = sc.next();
		System.out.println("Enter password");
		y = sc.next();
		System.out.println(auth.auth(x, y) ? "Authorised for access" : "Not Authorised");
		sc.close();
	}

}

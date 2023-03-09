package Assignment2;

import java.util.Scanner;

public class IsIncreasingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		if(checkNumber(n)) {
			System.out.println("Number is an increasing number");
		}
		else {
			System.out.println("NUmber is not an increasing number");
		}
	}
	public static boolean checkNumber(int number) {
		int temp1=100000;
		while(number!=0) {
			int temp = number%10;
			if(temp > temp1)
				return false;
			number/=10;
			temp1=temp;
		}
		return true;
	}
}

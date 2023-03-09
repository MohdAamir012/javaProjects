package Assignment2;
import java.util.Scanner;
public class Sum_of_natural_no_div_by_3_or_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println("the sum of first "+n+" natural number divisible by 3 or 5 is "+calculateSum(n));
	}
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}

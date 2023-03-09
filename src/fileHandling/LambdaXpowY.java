package fileHandling;

import java.util.Scanner;

public class LambdaXpowY {
	public double factCalculate(double x, double y) {
		return Math.pow(x, y);
	}

	public static void main(String[] args) {
		Lambda f = new LambdaXpowY()::factCalculate;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base");
		double x = sc.nextDouble();
		System.out.println("enter the power");
		double y = sc.nextDouble();
		System.out.println(x + "^" + y + "=" + f.cal(x, y));
		sc.close();
	}

}

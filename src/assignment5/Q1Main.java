package assignment5;


public class Q1Main{

	public static void main(String[] args) {

		Even e=new Even();
		Odd o=new Odd();
		Thread even=new Thread(e,"Even");
		Thread odd=new Thread(o,"odd");

		even.start();
		odd.start();

	}

}
package practiceForInterview;

import java.util.Scanner;

import ThreadAssignment.UserDefinedException;

public class WithMain {
public static String reverseString(String s) {
	String ans="";
	int n=s.length();
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		ans+=ch;
	}
	return ans;
}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String rev=reverseString(s);
		System.out.println(rev);
//		System.out.println("Enter any denominator ");
//		int d =sc.nextInt();
//		try {
////			if(d==0)
////				throw new UserDefinedException();
//		System.out.println(10/d);
////		}catch(UserDefinedException e) {
////			e.printStackTrace();
////		}
//	}catch(ArithmeticException e) {
//		e.printStackTrace();
//	}
//		Runnable r =()->
//		{
//			for(int i=0;i<5;i++) {
//			System.out.println("Hello");
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			}
//		};
		// TODO Auto-generated method stub
//		OddThread obj=new OddThread();
//		Thread t=new Thread(obj);
//		t.start();
		
		
	}

}

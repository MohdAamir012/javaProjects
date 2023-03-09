package assignment3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
    boolean t=true;
    while(t) {
		System.out.println("SELECT THE OPTIONS " + "\n1." + " Interest Calculator-SB" + " \n2." + " Interest Calculator-FD"
                + "\n3." + " InterestCalculator-RD" + "\n4 " + " Exit");
        int choice = sc.nextInt();
 
        switch (choice) {
            case 1:
                SBAccount sb = new SBAccount();
                    System.out.println("Enter the Average SB amount ");
                    double amount = sc.nextDouble();
                    try {
                        if (amount < 0) {
                            throw new InvalidAmountException();
                        }}
                        catch(InvalidAmountException e) {
                    	   e.getStackTrace();
                    	   return;
                       }
                       catch(Exception e) {
                    	   e.getStackTrace();
                    	   return;
                       }
                    System.out.println("Interest gained is :  " + sb.calculateInterest(amount));

                break;

            case 2:
                    FDAccount fd = new FDAccount();
                    System.out.println("Enter the FD Amount");
                    double fAmount = sc.nextDouble();
                    System.out.println("Interest gained is:  " + fd.calculateInterest(fAmount));
                break;
            case 3:
                    RDAccount rd = new RDAccount();
                    System.out.println("Enter the RD amount");
                    double Ramount = sc.nextDouble();
                    System.out.println("Interest gained is:  " + rd.calculateInterest(Ramount)); 
                break;

            case 4:
                System.out.println("Going out of the loop");
                t=false;
                break;
            default:
                System.out.println("Invalid Input");

        }
    }
	}

}

package assignment3;
import java.util.Scanner;
public class RDAccount extends Account {

    double interestRate;
    double amount;
    int noOfMonths;
    double monthlyAmount;
    double General, SCitizen;
    Scanner sc = new Scanner(System.in);

    @Override
    double calculateInterest(double amount){
        this.amount = amount;
       int age;
        
       try {
    	   System.out.println("Enter RD holder age");
           age = sc.nextInt();
        if(age<0){
            throw new InvalidAgeException();
        }
        if (amount < 0) {
            throw new InvalidAmountException();
        }
        System.out.println("Enter RD months");
        noOfMonths = sc.nextInt();
        if(noOfMonths<0){
        	
            throw new InvalidNoOfMonthsException();
        }
       }catch(InvalidAgeException e) {
    	   e.getStackTrace();
    	   return 0.0;
       }catch(InvalidAmountException e) {
    	   e.getStackTrace();
    	   return 0.0;
       }catch(InvalidNoOfMonthsException e) {
    	   e.getStackTrace();
    	   return 0.0;
       }
       catch(Exception e) {
    	   e.getStackTrace();
    	   return 0.0;
       }
        
        if (noOfMonths >= 0 && noOfMonths <= 6) {
            General = 0.0750;
            SCitizen = 0.080;
        } else if (noOfMonths >= 7 && noOfMonths <= 9) {
            General = 0.0775;
            SCitizen = 0.0825;
        } else if (noOfMonths >= 10 && noOfMonths <= 12) {
            General = 0.0800;
            SCitizen = 0.0850;
        } else if (noOfMonths >= 13 && noOfMonths <= 15) {
            General = 0.0825;
            SCitizen = 0.0875;
        } else if (noOfMonths >= 16 && noOfMonths <= 18) {
            General = 0.0850;
            SCitizen = 0.0900;
        } else if (noOfMonths >= 22) {
            General = 0.0875;
            SCitizen = 0.0925;
        }
        if(age < 50)
        	interestRate = General;
        else
        	interestRate = SCitizen;
        
        return amount * interestRate;

    }

}
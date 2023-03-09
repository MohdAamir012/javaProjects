package assignment3;
import java.util.Scanner;

class SBAccount extends Account {
    double amount , interestRate;
    Scanner sc = new Scanner(System.in);
    
    @Override
    double calculateInterest(double amount) {
        this.amount = amount;
        System.out.println("Select account type \n1. NRI \n2. Normal ");
        int accountChoice = sc.nextInt();
        switch (accountChoice) {
            case 1:
                interestRate = 0.06;
                break;
            case 2:
                interestRate = 0.04;
                break;
            default:
                System.out.println("Invalid Input : ");
                
        }
     return amount * interestRate;
   
}
}
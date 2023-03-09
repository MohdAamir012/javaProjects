package assignment3;

import java.util.Scanner;

public class FDAccount extends Account {

	double interestRate;
	double amount;
	int noOfDays;
	int ageOfHolder;
	double General, SCitizen;
	Scanner sc = new Scanner(System.in);

	@Override
	double calculateInterest(double amount) {
		this.amount = amount;

		try {
			System.out.println("Enter FD age holder ");
			ageOfHolder = sc.nextInt();
			if (ageOfHolder < 0) {
				throw new InvalidAgeException();
			}

			if (amount < 0) {
				throw new InvalidAmountException();
			}
			System.out.println("Enter FD days");
			noOfDays = sc.nextInt();
			if (noOfDays < 0) {
				throw new InvalidNoOfDaysException();
			}
		} catch (InvalidAgeException e) {
			e.printStackTrace();
			return 0.0;
		} catch (InvalidNoOfDaysException e) {
			e.printStackTrace();
			e.getMessage();
			return 0.0;
		} catch (Exception e) {
			e.printStackTrace();
			return 0.0;
		}
		if (amount > 0 && amount < 10000000) {
			if (noOfDays >= 7 && noOfDays <= 14) {
				General = 0.0450;
				SCitizen = 0.0500;
			} else if (noOfDays >= 15 && noOfDays <= 29) {
				General = 0.0475;
				SCitizen = 0.0525;
			} else if (noOfDays >= 30 && noOfDays <= 45) {
				General = 0.0550;
				SCitizen = 0.0600;
			} else if (noOfDays >= 45 && noOfDays <= 60) {
				General = 0.0700;
				SCitizen = 0.0750;
			} else if (noOfDays >= 61 && noOfDays <= 184) {
				General = 0.0750;
				SCitizen = 0.0800;
			} else if (noOfDays >= 185 && noOfDays <= 365) {
				General = 0.0800;
				SCitizen = 0.0850;
			}

			if (ageOfHolder < 50)
				interestRate = General;
			else
				interestRate = SCitizen;

		} else {
			if (noOfDays >= 7 && noOfDays <= 14) {
				interestRate = 0.065;
			} else if (noOfDays >= 15 && noOfDays <= 29) {
				interestRate = 0.0675;
			} else if (noOfDays >= 30 && noOfDays <= 45) {
				interestRate = 0.0675;
			} else if (noOfDays >= 45 && noOfDays <= 60) {
				interestRate = 0.080;
			} else if (noOfDays >= 61 && noOfDays <= 184) {
				interestRate = 0.0850;
			} else if (noOfDays >= 185 && noOfDays <= 365) {
				interestRate = 0.10;
			}

		}

		return amount * interestRate;
	}
}
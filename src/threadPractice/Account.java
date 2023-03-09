package threadPractice;

public class Account implements Runnable{
	private double balance=35000;
	
//	public synchronized void withdraw(String name, double amt) {
//		if(amt<balance) {
//			System.out.println(name+" going to withdraw "+amt);
//			synchronized(this) {
//			balance-=amt;
//			System.out.println("Transaction success "+"remaining balance is "+balance);
//			}
//		}
//		else {
//			System.out.println(name+" has not enough balance");
//		}
//	}
	public synchronized void withdraw(String name, double amt) {
		if(amt<balance) {
			System.out.println(name+" going to withdraw "+amt);
			
			balance-=amt;
			System.out.println("Transaction success "+"remaining balance is "+balance);
			}
		else {
			System.out.println(name+" has not enough balance");
		}
	}
//	public void withdraw(String name, double amt) {
//		if(amt<balance) {
//			System.out.println(name+"going to withdraw "+amt);
//			balance-=amt;
//			System.out.println("Transaction success "+"remaining balance is "+balance);
//		}
//		else {
//			System.out.println(name+"not enough balance");
//		}
//	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		withdraw(Thread.currentThread().getName(),15000);
	}
}

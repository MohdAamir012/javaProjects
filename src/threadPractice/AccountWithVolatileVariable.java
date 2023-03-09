package threadPractice;

import java.util.concurrent.atomic.AtomicInteger;

public class AccountWithVolatileVariable implements Runnable{
//	private volatile double balance=35000;
	private AtomicInteger balance=new AtomicInteger(35000);	
	public void withdraw(String name, double amt) {
		if(amt<balance.doubleValue()) {
//			System.out.println(name+"going to withdraw "+amt);
			balance.set((int) (balance.get()-amt));
			System.out.println("Transaction success "+"remaining balance is "+balance);
		}
		else {
			System.out.println(name+"not enough balance");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		withdraw(Thread.currentThread().getName(),15000);
	}
}

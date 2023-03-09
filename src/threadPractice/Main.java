package threadPractice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Account acc1=new Account();
AccountWithVolatileVariable acc1=new AccountWithVolatileVariable();
Thread t1=new Thread(acc1,"Yatin");
Thread t2=new Thread(acc1,"Yatin through mobile");
Thread t3=new Thread(acc1,"Yatin through net banking");
t1.start();
t2.start();
t3.start();
	}

}

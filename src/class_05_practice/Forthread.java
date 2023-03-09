package class_05_practice;
class DemoThread extends Thread {
	public void run() {
		System.out.println("Thread is running"+Thread.currentThread().getName());
	}
}
public class Forthread{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread t1 =new DemoThread();
		DemoThread t2 =new DemoThread();
		DemoThread t3 =new DemoThread();
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}

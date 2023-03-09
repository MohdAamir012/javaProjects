package threadPractice;

class MyThread implements Runnable{
//	public synchronized void printMessage(String name) {
//		for(int i=0;i<5;i++) {
//			System.out.println(name);
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e){
//				e.printStackTrace();
//			}
//		}
//	}
//	if a method is static one copy of function is created you can synchronize diff obj of thread
	public static synchronized void printMessage(String name) { 
		for(int i=0;i<5;i++) {
			System.out.println(name);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
//	public static synchronized void printMessage(String name) { 
//		for(int i=0;i<5;i++) {
//			System.out.println(name);
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e){
//				e.printStackTrace();
//			}
//		}
//	}
	@Override
	public void run() {
			printMessage(Thread.currentThread().getName());
	}
	
}
public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread obj1 =new MyThread ();
		MyThread obj2 =new MyThread ();
		MyThread obj3 =new MyThread ();
		Thread t1=new Thread(obj1,"A");
		Thread t2=new Thread(obj2,"B");
		Thread t3=new Thread(obj3,"C");
		
		t1.start();
		t2.start();
		t3.start();
	}

}

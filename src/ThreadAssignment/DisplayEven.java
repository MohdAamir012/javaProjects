package ThreadAssignment;

public class DisplayEven extends Thread {
	
		public  void printEven(int i) {
			System.out.println("Even     "+i);
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
	}
		@Override
		public void run() {
			for(int i=2;i<100;i=i+2) {
			printEven(i);
			}
		}
}
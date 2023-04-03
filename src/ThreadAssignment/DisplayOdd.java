package ThreadAssignment;

public class DisplayOdd implements Runnable {
	public  void printOdd(int i) {
		System.out.println("Odd    "+i);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
} 
	@Override
	public void run() {
		for(int i=1;i<100;i=i+2) {
		printOdd(i);
		}
	}
	

}

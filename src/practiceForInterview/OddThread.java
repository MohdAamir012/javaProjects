package practiceForInterview;

public class OddThread extends Thread {
	public void display(int n) {
		System.out.println("value ==="+n);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			display(i);
		}
	}
}

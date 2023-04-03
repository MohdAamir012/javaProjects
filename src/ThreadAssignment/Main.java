package ThreadAssignment;

public class Main {

	public static void main(String[] args) {
		DisplayEven d1=new DisplayEven();
		DisplayOdd d2=new DisplayOdd();
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);	
		t1.start();
		t2.start();
		
	}

}

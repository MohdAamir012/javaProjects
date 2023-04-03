package assignment5;

import java.time.LocalDateTime;

public class Q3Main {
	public static void main(String[] args) {
		Runnable r=()->{

			while(true) {
				LocalDateTime ld=LocalDateTime.now();
				System.out.println(ld.getHour()+":"+ld.getMinute()+":"+ld.getSecond());
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t=new Thread(r);
		t.start();
	}

}
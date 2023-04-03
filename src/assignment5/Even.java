package assignment5;

public class Even implements Runnable{
	   int a=2;
	   public void display()
	   {
		   while(a<=20)
		   {  System.out.println("Even "+a);
			   a+=2;
			   try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			   }
	   }

	   public void run()
	   {
		  display();
	   }
	}
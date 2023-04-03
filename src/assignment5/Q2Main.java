package assignment5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Q2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			FileInputStream input=new FileInputStream("D://NewFolder/source.txt");
			FileOutputStream output =new FileOutputStream("D://NewFolder/destination.txt");
			CopyDataThread thread=new CopyDataThread(input,output);
			//opyDataThread t=new CopyDataThread(f);
			thread.start();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
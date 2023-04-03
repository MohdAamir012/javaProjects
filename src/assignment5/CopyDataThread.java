package assignment5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDataThread extends Thread {
	private InputStream input;
	private OutputStream output;

	public CopyDataThread(FileInputStream input2, FileOutputStream output2) {
		this.input = input2;
		this.output = output2;
	}

	public void run() {
		int count = 0;

		int data;
		try {
			while ((data = input.read()) != -1) {
				output.write(data);
				count++;
				if (count == 10) {
					System.out.println("Ten characters are copied");
					count = 0;
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			input.close();
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
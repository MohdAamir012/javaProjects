package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FunctionOnFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("D://Aamir/t.txt");
		try(BufferedReader br =new BufferedReader(fr)){
			String st=null;
			int i=1;
			while((st=br.readLine())!=null) {
				System.out.println(i+" "+st);
				i++;
			}
		}
				
	}}
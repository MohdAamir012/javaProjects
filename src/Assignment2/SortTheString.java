package Assignment2;
import java.util.Arrays;
public class SortTheString {

	public static void main(String[] args) {
		
String arr[]= {"Januray","February","March","April","May","June","July","August","September","October","November","December","Temp"};
sortString(arr);
for(String i :arr) {
	System.out.println(i);
}
	}
	public static String [] sortString(String arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<=arr.length/2;i++) {
			arr[i]=arr[i].toUpperCase();
		}
		for(int i=(arr.length/2+1);i<arr.length;i++) {
			arr[i]=arr[i].toLowerCase();
		}
		return arr;
	}
}

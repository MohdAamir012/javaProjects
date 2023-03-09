package Assignment2;

public class SecondSmallest {

	public static void main(String[] args) {
		int arr[]= {12,34,54,76,87,21,21,54,34,23};
		System.out.println("The second smallest element in an array is "+getSecondSmallest(arr));

	}
	public static int getSecondSmallest(int []a) {
		int temp;  
		for (int i = 0; i < 2; i++)   
		        {  
		            for (int j = i + 1; j < a.length; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		return a[1];
	}
}

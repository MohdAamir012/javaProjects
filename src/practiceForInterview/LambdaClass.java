package practiceForInterview;

public class LambdaClass {
public void add (int a,int b) {
	System.out.println(a+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LamdaInterface li=new LambdaClass()::add;
//		li.sum(10, 5);
		LamdaInterface li2=(a,b)->{
			System.out.println(a+b);
		};
		li2.sum(10, 12);
		//System.out.println();
	}

}

package mphasis;

public class EvenOdd {
	
	public void check(int n) {
		if(n%2==0) {
			System.out.println("it is a even number");
		}
		else {
		System.out.println("it is odd number");
		}
	}
	
	public static void main(String[] args) {
		int n=45;
		 EvenOdd obj = new EvenOdd();
		  obj.check(n);
	}

}




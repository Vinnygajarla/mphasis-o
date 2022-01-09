package mphasis;

public class Calculation {
	public void check(int a,int b) {
		int c=a+b;
		System.out.println("sum is"+c);
	}
	
	
	public static void main(String[] args) {
		int a,b;
		a=2;
		b=3;
		Calculation obj=new Calculation();
		obj.check(a,b);
		
	}

}

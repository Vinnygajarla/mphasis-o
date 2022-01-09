package mphasis;

public class PosNeg {
	public void show(int n) {
		if(n>0) {
			System.out.println("it is a positve number");
		}
		else {
			System.out.println("it is a negative number");
		}
	}
	
	
	
	public static void main(String[] args) {
		int n=6;
		PosNeg obj=new PosNeg();
		obj.show(n);
		
	}

}

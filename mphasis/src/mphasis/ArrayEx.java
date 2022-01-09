package mphasis;

public class ArrayEx {
	public static void main(String[] args) {
		int [] a= new int[] {12,3};
	try {
			a[10]=55;
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("array out of bound");
	}catch (Exception e) {
		e.printStackTrace();
	}
	
		
		
	}

}

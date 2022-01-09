package mphasis;

public class ArrayDemo1 {
	public void show() {
		int[]a=new int[] {1,2,3,4,5};
	//	for( int i=0;i<=a.length-1;i++) {
	//		System.out.println(a[i]);
	//	}
		
		for (int i:a) {
			System.out.println(i);
		}
			
	}
	
	
	public static void main(String[] args) {
		ArrayDemo1 obj=new ArrayDemo1();
		obj.show();
	}

}

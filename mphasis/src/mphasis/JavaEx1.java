package mphasis;

public class JavaEx1 {
	
	public void show(int n) {
		int i=0;
		while(i<10) {
			System.out.println("loop"+i);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		int n=10;
		JavaEx1 obj=new JavaEx1();
		obj.show(n);
		
		
	}

}

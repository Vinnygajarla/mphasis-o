package Inhc;


	class C1 {
		C1() {
			System.out.println("Base Class Constructor...");
		}
	}

	class C2 extends C1 {
		C2() {
			System.out.println("Derived Class Constructor...");
		}
	}

	public class inhc {
		public static void main(String[] args) {
			C2 obj = new C2();
		}
	}


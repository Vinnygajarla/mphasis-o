package mphasis;

public class CaseDemo2 {
	public void show(String dayName) {
		switch(dayName) {
		case "Sun" :
			System.out.println("this is sunday");
			break;
		case "Mon" :
			System.out.println("this is monday");
			break;
		case "Tue":
			System.out.println("this is tuesday");
			break;
		case "Wed" :
			System.out.println("this is Wednesday");
			break;
		case "Thur" :
			System.out.println("this is thursday");
			break;
		case "Fri" :
			System.out.println("this is friday");
			break;
		case "sat"	:
			System.out.println("this is saturday");
			break;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		String dayName="Sun";
		CaseDemo2 obj=new CaseDemo2();
		obj.show(dayName);
		
	}

}

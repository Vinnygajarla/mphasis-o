package mphasis;

public class Data2 {
	int custId;
	String custName;
	double premium;
	
	@Override
	public String toString() {
		return "Data [custId=" + custId + ", custName=" + custName + ", premium=" + premium + "]";
	}

	public static void main(String[] args) {
		Data2 obj1 = new Data2();
		obj1.custId=1;
		obj1.custName="Pragati";
		obj1.premium=88424;
		
		System.out.println(obj1);
	}

}

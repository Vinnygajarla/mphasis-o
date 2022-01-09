package mphasis;

public class StrExamples {
	
	public void show() {
	String str="Welcome to Java Programming...From Prasanna...";
	System.out.println("Length of String is  " +str.length());
	System.out.println("character position" +str.charAt(6));
    System.out.println("index number of char" +str.indexOf("p"));
    System.out.println("lower case"+" " +str.toLowerCase());
    System.out.println("upper case" +str.toUpperCase());
    String s1="chummi", s2="vinny",s3="renu";
    System.out.println(s1.equals(s2));
    System.out.println(s2.equals(s3));
    System.out.println(s1.compareTo(s2));
    System.out.println(s2.compareTo(s3));
	}
	
	public static void main(String[] args) {
		StrExamples obj=new StrExamples();
		obj.show();
	}
}

//*String Manipulation
public class StringManipulation {
	
	public static void main(String[] args) {

	//String : it is one of the prebuilt class in java
	/* 1.String literal
	2.by creating object of string*/

	String a= " javatraining";//string 

	System.out.println(a.charAt(2));
	System.out.println(a.indexOf("e"));
	System.out.println(a.substring(3, 6));
	System.out.println(a.substring(5));
	System.out.println(a.concat("rahul teaches"));
	//a.length()
	System.out.println(a.trim());
	a.toUpperCase();
	a.toLowerCase();
	//split
	String arr[]=a.split("t");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(a.replace("t", "s"));
	
	}
	}


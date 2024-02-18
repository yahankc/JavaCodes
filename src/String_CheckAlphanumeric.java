import java.util.Scanner;

public class String_CheckAlphanumeric {

	public static void main(String[] args) {
		
		
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check: ");
		String str=sc.nextLine();
		
		
		System.out.println(str.matches("[a-zA-Z0-9]+")); */
		String s1="adA45", s2="jh@l";
		System.out.println(s1.matches("[a-zA-Z0-9]+"));
		
		
		System.out.println(s2.matches("[a-zA-Z0-9]+")); 
	}
}

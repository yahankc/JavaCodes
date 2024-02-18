//*String memory location concept

public class String3 {

	public static void main(String[] args) {
		
		
		String str1 = "Hello";						//String literals
		String str2 = new String(str1);				//creating object of string
		String str3 = "Hello";
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2 );
		System.out.println(str1 == str3 );
		 
			
		}		

	
}

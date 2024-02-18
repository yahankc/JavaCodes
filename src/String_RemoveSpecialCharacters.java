
public class String_RemoveSpecialCharacters {
	
	public static void main(String[] args) {
		
		String str="J av%a S$ ta**@#r56";
		
		
		String str1=str.replaceAll("[^a-zA-Z0-9]", "");  //match strings made up of alphanumeric characters only. ^ :(ANY CHARACTER EXCEPT)
		System.out.println(str1);
	}

}

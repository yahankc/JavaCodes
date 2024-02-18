//*alphabetical order

import java.util.Arrays;


public class String4 {
	
	public static void main(String[] args) {
		
		String str="My name is Kamlesh";
		
		String ustr=str.toUpperCase();
		
					
		char[] arr=ustr.toCharArray();
		
		Arrays.sort(arr);
		
			System.out.println(arr);
	}

}

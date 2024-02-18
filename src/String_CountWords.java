//Program to count number of words in a string.

public class String_CountWords {

	public static void main(String[] args) {
		
		String str="Ka ml esh "; //words:7
		
		char chars[]=str.toCharArray();
		
		StringBuilder sb=new StringBuilder();
	/*	System.out.println(str.length()); //10 
		
		System.out.println(chars.length); //10
		
		String[] nstr=str.split("\\s");
		
		System.out.println(nstr.length);  //3		*/
		
		for(int i=0;i<chars.length;i++)
		{
			if(chars[i]==' ')
			{
				
			}
			else
				sb.append(chars[i]);
		}
		System.out.println(sb.length());
		
		
	}
}

//* ReverseString 
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Shivam is live";
		String rstr="";

		for(int i=s.length()-1;i>=0;i--)
		{
			rstr=rstr+s.charAt(i);
		}
		System.out.println(rstr);
		
	}

}

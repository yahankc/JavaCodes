
public class String_RemoveDuplidates {
	
	
	public static void main(String[] args) {
		String str="Programming";
		StringBuilder sb=new StringBuilder();
		
		boolean repeated=false;
		char[] charArr=str.toCharArray();
		
		for(int i=0;i<charArr.length;i++)
		{
			repeated=false;
			for(int j=i+1;j<charArr.length;j++)
			{
				if(charArr[i]==charArr[j])
				{
					repeated=true;
					break;
				}
			}
			if(!repeated)
			{
				sb.append(charArr[i]);
			}
		}
		System.out.println(sb);
		
	}

}

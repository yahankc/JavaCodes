//Arrange in alphabetical order

public class String_AlphabeticOrder {
	
	public static void main(String[] args) {
		
		String str="therock";
		char chArr[]=str.toCharArray();
		char c=' ';
		
		for(int i=0;i<chArr.length;i++)
		{
			for(int j=i+1;j<chArr.length;j++)
			{
				if(chArr[i]>chArr[j])
				{
					c=chArr[i];
					chArr[i]=chArr[j];
					chArr[j]=c;
				}
			}
		}
		System.out.println(chArr);
	}

}

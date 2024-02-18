 /*				
  		A
  		B B
  		C C C
  		D D D D
  		E E E E E
  				 
 */
public class Pattern94 {

	
	public static void main(String[] args) {
		char ch='A';

		for(int i=1;i<=5;i++)  //outer for loop- Rows
		{
			for(int j=1;j<=i;j++)  // how many columns in that row only
			{
				System.out.print(ch+" ");
				
			}
			ch++;
			System.out.println();
		}
		
		}
	}

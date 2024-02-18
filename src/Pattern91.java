 /*				
  		 1
  		 1 2 
  		 1 2 3
  		 1 2 3 4
 								 
 */
public class Pattern91 {

	
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)  //outer for loop- Rows
		{
			for(int j=1;j<=i;j++)  // how many columns in that row only
			{
				System.out.print(j+" ");
	
			}
			System.out.println();
		}
		
		}}

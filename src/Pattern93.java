 /*				
  		 1
  		2 2 
  	   3 3 3
  	  4 4 4 4
 								 
 */
public class Pattern93 {

	
	public static void main(String[] args) {

		for(int i=1;i<=4;i++)  //outer for loop- Rows
		{
			for(int j=1;j<=4-i;j++)  // how many columns in that row only
			{
				System.out.print(" "+" ");
	
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print(i+" "+" ");
			}
			System.out.println();
		}
		
		}
	}

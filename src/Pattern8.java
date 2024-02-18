 /*				
  				* 
 			  * * *
 			* * * * *
 		  *	* *	* *	* *
 		* * * * * * * * * 
 								 
 */
public class Pattern8 {

	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)  //outer for loop- Rows
		{
			for(int j=1;j<=5-i;j++)  // how many columns in that row only
			{
				System.out.print(" "+" ");
	
			}
			for(int k=1;k<=i;k++)
			System.out.print("*"+" ");
			System.out.println();
		}
		
		}}

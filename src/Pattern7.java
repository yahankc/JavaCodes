 /*				
  				* 
 			  * * 
 			* * * 
 		  *	* *	* 
 		* * * * * 
 		  * * * *
  	 	    * * *
  	 		  * *
  	 		    *
  	 		        
 								 
 */
public class Pattern7 {

	
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
		for(int i=1;i<=4;i++)  //outer for loop- Rows
		{
			for(int j=1;j<=i;j++)  // how many columns in that row only
			{
				System.out.print(" "+" ");
	
			}
			for(int k=1;k<=5-i;k++)
			System.out.print("*"+" ");
			System.out.println();
		}
		
		}
}

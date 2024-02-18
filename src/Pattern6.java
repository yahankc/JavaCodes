 /*				
  	 		* * * * *
  	 		  * * * *
  	 		    * * *
  	 		      * *
  	 		        *
 								 
 */
public class Pattern6 {

	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)  //outer for loop- Rows
		{
			for(int j=1;j<=i-1;j++)  // how many columns in that row only
			{
				System.out.print(" "+" ");
	
			}
			for(int k=1;k<=6-i;k++)
			System.out.print("*"+" ");
			System.out.println();
		}
		
		}
}

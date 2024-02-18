/* 	s e l e n i u m
 *  s e l e n i u
 *  s e l e n i
 *  s e l e n 
 *  s e l e 
 *  s e l
 *  s e
 *  s
 */
public class Pattern3 {

	public static void main(String[] args) {
		String str = "selenium";
		
		char arr[] = str.toCharArray();
		
		int size=arr.length;
		
		for (int i = size-1; i >= 0; i--) 
		{
			for (int j = 0; j < i + 1; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	
		
	}	
}

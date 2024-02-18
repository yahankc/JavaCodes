//find the common elements between two arrays

public class Array9 {
	
	public static void main(String[] args) {
		
		int arr1[]= {2,5,6,7,10,1};
		int arr2[]= {5,2,8,9,10};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					System.out.print(arr1[i]+" ");				
			}
		}
		
	
		
	}

}

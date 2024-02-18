//*reverse an array without using another array in java
public class Array10_ReverseWithout {

	public static void reverse(int[] arr)
	{
		int temp;
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}	
		
	}
	public static void main(String[] args) {
		
		int arr[]= {2,4,6,3,1};
		reverse(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}

//reverse an array with using another array in java 
public class Array11 {

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,3,1};
		int rev[]= new int [arr.length];
		int j=0;
		//System.out.println(arr.length);
		
		for(int i=arr.length-1;i>=0 ; i--)
        {
            rev[j] = arr[i];
            j++;
    
        }
		
		for(int k=0;k<rev.length;k++)
		System.out.print(rev[k]+" ");
		
	}
}

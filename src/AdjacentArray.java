//*Max difference between any adjacent index in array
public class AdjacentArray {
	
	public static void main(String[] args) {
		
		int a[]={1,4,8,15,17};
		//int min=Integer.MIN_VALUE;
		

		int diff=0;
		for(int i=0;i<a.length-1;i++)		
		{
			if((a[i+1]-a[i])>diff)
			{
				diff=a[i+1]-a[i];
			}
		}
		
		System.out.print("Maximum difference: "+diff);
	}

}

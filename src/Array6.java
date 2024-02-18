//Write a Java program to find the minimum element in an array.

public class Array6 {

	public static void main(String[] args) {
		
		int a[]= {67,88,54,23,69};
		int min=Integer.MAX_VALUE;
		
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
			min=a[i];
	}
	System.out.println(min);
	}
}

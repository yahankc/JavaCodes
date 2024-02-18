//Write a Java program to find the maximum element in an array.

public class Array5 {

	public static void main(String[] args) {
		
		int a[]= {67,88,54,105,23,69};
		int max=Integer.MIN_VALUE;
		
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
			max=a[i];
	}
	System.out.println(max);
	}
}

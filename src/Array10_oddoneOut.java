//print non-matching element between two arrays
import java.util.ArrayList;

public class Array10_oddoneOut {
	public static void main(String[] args) {
		
	int arr[]= {2,4,5,8,22,42};
	int brr[]= {2,4,5,8,22,33};
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<arr.length;i++)
	{
		al.add(arr[i]);
	}
/*	ArrayList<Integer> bl=new ArrayList<Integer>();
	for(int i=0;i<brr.length;i++)
	{
		bl.add(brr[i]);
	} */
	for(int element:brr)
	{
		if(!al.contains(element))
			System.out.println(element);
	}
	
	}	
	}
	

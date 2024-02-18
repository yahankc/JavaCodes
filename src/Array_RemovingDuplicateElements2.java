//Removing duplicate elements in an array without using collection
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Array_RemovingDuplicateElements2 {
	
	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,9,4,4,9,3,1,7};		
	
		ArrayList<Integer> al=new ArrayList<Integer>();
		boolean repeated=false;
		for(int i=0;i<a.length;i++)
		{
			repeated=false;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					repeated=true;
					break;
				}
			}
			if(!repeated)
			{
				al.add(a[i]);
			}
		}
		for(int element:al)
			System.out.print(element+" ");
	}

}

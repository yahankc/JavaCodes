//*Removing duplicate elements in an array using Collection
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Array_RemovingDuplicateElements {
	
	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,4,4,3,1,7};		//Removing duplicate elements in an array
		
		Set<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		
		Iterator itr=hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"  ");
		}
				
	}

}

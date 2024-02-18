import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sorting {
	
	public static void main(String[] args) {
		
		int a[]= {7,4,2,9,1,2,10,7,5};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		
		Collections.sort(al);
		System.out.println(al);
	}

}

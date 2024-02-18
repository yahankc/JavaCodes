import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Element_Frequency3 {
	
	public static void main (String[] args)
	{
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int[] arr = { 2, 3, 4, 5, 4, 4, 2, 1, 2, 7 ,7};		// Print occurence of each element from the list
		for (int i = 0; i < arr.length; i++) 
		{
			int count = 0;
			if (!al.contains(arr[i])) 
			{
				al.add(arr[i]);
				count++;

				for (int j = i + 1; j < arr.length; j++) 
				{
					if (arr[i] == arr[j])
						count++;
				}
				System.out.println(arr[i]+" is repeating "+count+" times");
				
			}
		
		} 	
		
	}
}

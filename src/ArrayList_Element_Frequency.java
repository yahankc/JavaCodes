import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Element_Frequency {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 4, 4, 2, 1, 2, 7 ,7};		// Print unique number from the list- Amazon

		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> au = new ArrayList<Integer>();
		

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
		if(count==1)
				au.add(arr[i]); 
		}
		System.out.println("Unique elements: ");
		for(int unique:au)
		{
			System.out.print(unique+" ");
		}   	

	}  
}

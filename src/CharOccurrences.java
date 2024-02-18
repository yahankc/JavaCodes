import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* find the duplicate characters and its occurrences in a given string */

public class CharOccurrences {
	
	public static void main(String[] args) {
		
		String str="uutyutrut";
		findDuplicates(str);
	}

	public static void findDuplicates(String str) {
		
		if(str==null || str.isEmpty())
			return;
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(char c:str.toCharArray())
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		System.out.println(map);
		
		for(Entry<Character,Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		
	}

}

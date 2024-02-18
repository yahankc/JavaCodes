import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* find the duplicate characters and its occurrences in a given string */

public class CharOccMax {
	
	public static void main(String[] args) {
		
		String str="tyutrut";
		findDuplicates(str);
	}

	public static void findDuplicates(String str) {
		
		int maxval=0;
		char maxkey=' ';
				
		
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
			if(m.getValue()>maxval)
			{
				maxval=m.getValue();
				maxkey=m.getKey();
			}
			
		}
		
		System.out.println("Max. occuring character in the string: "+maxkey);
		
	}

}

import java.util.HashMap;
import java.util.Map;

public class String_CharOccurrence {
	
	
	public static void main(String[] args) {
		
		String str="beboeyoo";
		
		char chars[]=str.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<chars.length;i++)
		{
			if(!map.containsKey(chars[i]))
			{
				map.put(chars[i], 1);
			}
			else
			{
				int value=map.get(chars[i]); //Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key. 
			
				map.put(chars[i], value+1);
			}
		}
		System.out.println(map);
	}

}

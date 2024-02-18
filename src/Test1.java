import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {
		
		String check="mississipie";
		
		HashMap<Character,Integer> map=new HashMap();
		
		
		for(int i=0;i<check.length();i++)
		{
		
			if(!map.containsKey(check.charAt(i)))
			{
				map.put(check.charAt(i), 1);
			}
			else
			{
				int value=map.get(check.charAt(i));
				map.put(check.charAt(i), value+1);  //m 1//i 1//s 1//
			}
		}
		System.out.println(map);
	}
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Kamlesh");
		a1.add("Shivam");
		a1.add("Deepak");
		a1.add("Ravi");
		a1.add("Kamlesh");
		a1.add("Krishan");
		
	/*	int freq=Collections.frequency(a1,"Kamlesh");			
		System.out.println(freq);		*/
		
		
		/* for (String friend : a1)
			System.out.println(friend); */

		/*
		 * Iterator itr= a1.iterator();
		 *  while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */

		System.out.println(a1.get(2));		//retrieving element
		a1.set(1, "Shimma");				//replacing element
		a1.add(0, "Harsh");
		a1.remove("Harsh");
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Amit");
		a2.add("Vivek");
		a2.add("Rajiv");
		
		a1.addAll(a2);		//adding two arraylist
		

		for (String friend : a1)
			System.out.println(friend);    
	}   

}

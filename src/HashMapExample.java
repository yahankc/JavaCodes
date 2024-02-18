import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap: Store objects in key, value pairs
//Multiple programs can access HashMap at a time..so it is non-synchronized. While in HashTable, one program can access HashTable at at time.
public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Robin");
		hm.put(0, "Swarley");
		hm.put(3, "Barney");
		hm.put(2, "Robin");

		hm.remove(2);
		Set sn = hm.entrySet(); // putting hashmap into set (only then we can traverse)

		Iterator itr = sn.iterator();

		while (itr.hasNext()) {
			// System.out.println(itr.next());
			Map.Entry mp = (Map.Entry) itr.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}

	}

}

import java.util.ArrayList;
import java.util.HashSet;

//Extract vowels, consonants & special symbols in a String

public class String1 {

	public static void main(String[] args) {

		String str = "to The avtar Men Ua";
		String Ustr = str.toUpperCase();
		int size = str.length();
		int i = 0;

		HashSet<Character> set = new HashSet<>();

		while (i != size) {
			char c = Ustr.charAt(i);
			if (isVowel(c)) {
				set.add(c);
			}
			i++;
		}
 
		for (char v : set) {
			System.out.print(v + " ");
		}

	}

	public static boolean isVowel(char c) {

		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			return true;
		} else
			return false;

	}
}

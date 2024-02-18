//*Print maximum occurence character in the string
public class String_MaxOccChar {

	public static void main(String[] args) {

		int charArr[] = new int[256];

		int max = Integer.MIN_VALUE;

		char c = ' ';
		String str = "Donkeyoposoiteepeeie";

		int size = str.length();

		for (int i = 0; i < size; i++) {
			charArr[str.charAt(i)]++;
		}

		for (int i = 0; i < size; i++) {
			if (max < charArr[str.charAt(i)]) {
				max = charArr[str.charAt(i)];
				c = str.charAt(i);
			}
		}
		System.out.println(c+" is repeating max: "+max+" times");
	}

}

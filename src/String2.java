 //*count vowels, consonants & special symbols in a String
public class String2 {

	public static void main(String[] args) {

		int vowcnt = 0;
		int conscnt = 0;
		int spclcnt = 0;

		int i = 0;
		String str = "The Sigma's rule";
		String Ustr=str.toUpperCase();

		char arr[] = Ustr.toCharArray();

		int size = arr.length;

		while (i != size) {

			if (arr[i] >= 'A' && arr[i] <= 'Z') {
				if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') 
				{
					vowcnt++;
				} 
				else
					conscnt++;
			}
			else
				spclcnt++;
			i++;
		}

		System.out.println("Vowel count: " + vowcnt);
		System.out.println("Constant count: " + conscnt);
		System.out.println("special char count: " + spclcnt);
	}
}

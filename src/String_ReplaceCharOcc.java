
public class String_ReplaceCharOcc {

	public static void main(String[] args) {
		String str = "Opentextttttttttt0";

		char charToReplace = 't';
		

		if (str.indexOf(charToReplace) == -1) 
		{
			System.out.println("Given character is not present in the String");
			System.exit(0);
		}
		int cnt = 1;
		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);

			if (c == charToReplace) {
				 str=str.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
				cnt++;
			}

		}
		System.out.println(str);
	}

}

import java.util.Scanner;

//*Program to print initials of a name

public class String_Print_Initial {
	
	public static void main(String[] args) {
		
	//	String str="Kamlesh Kumar";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String fullName=sc.nextLine();
		
		String[] name=fullName.split("\\s");
		
		for(String nstr:name)
		{
			System.out.print(nstr.charAt(0));
		}
	}

}

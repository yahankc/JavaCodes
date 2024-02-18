//Write a program to find out whether a given integer is present in an array or not.

public class Array1 {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 12, 44, 23, 12 };

		int num = 23;
		boolean check = false;
		

		for (int element : arr) {
			if (element == num) {
				check = true;
				break;
			}

		}
		if (check == true)
			System.out.println("Given Integer: " +num+" is present in an array");
		else
			System.out.println("not present");
	}	
}

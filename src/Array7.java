//Write a Java program to find whether an array is sorted or not.

public class Array7 {

	public static void main(String[] args) {

		int arr[] = { 23, 76, 54, 33, 11, 37, 99, 52 };

		boolean flag = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("array is SORETED");
		} else
			System.out.println("array is not SORETED");

	}

}

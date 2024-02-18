//*check weather a number is prime or not.
//Prime: Number which divide by 1 and itself only.
public class PrimeNumber {

	public static void main(String[] args) {

		boolean isPrime = true;
		int number = 14;
		
		int m=number/2;
		
		if(number==0 || number==1)
		{
			System.out.println("Not a prime number");
		}
		else {
		for (int i = 2; i <= m; i++) {
			
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime == true)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
	}
}
//4!=4*3*2*1
public class Factorial {
	
	public static void main(String[] args) {
		int number=4,fact=1;
		
		for(int i=1;i<= number;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}

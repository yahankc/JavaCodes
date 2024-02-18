//Create a Method which accepts Array and returns sum of all the elements in array 
	//Print 5 Multiplication table without using Multiply operator

public class SumOfElements {

	
	public static void main(String[] args) {
		
		int result= withoutMultply(6,11);
		System.out.println(result);
	}

	public static int withoutMultply(int i, int j) {
		
		int sum=0;
		while(j>0)
		{
			sum=sum+i;
			j--;
		}
		return sum;
	}
}

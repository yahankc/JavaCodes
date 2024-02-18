
//Create an array of 5 floats and calculate their sum.

public class Array {
	
	public static void main(String[] args) {
		float arr[] = { 2.3f, 4.5f, 6.7f, 2.2f, 1.4f };
		
		float sum=0;
		
		for(float element :arr)
		{
			sum=sum+element;
		}
		System.out.println(sum);

	}

}

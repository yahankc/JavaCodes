
//Calculate the average marks from an array containing marks of all students in physics using a for-each loop.

public class Array2 {
	public static void main(String[] args) {
		float marks[] = { 2.3f, 4.5f, 6.7f, 2.2f, 1.4f };
		
		float sum=0;
		
		for(float element :marks)
		{
			sum=sum+element;
		}
		System.out.println("Avg.marks= "+sum/marks.length);

	}

}

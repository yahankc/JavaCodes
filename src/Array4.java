//Write a Java program to reverse an array.

public class Array4 {
	
	public static void main(String[] args) {
		
		float marks[] = { 2.3f, 4.5f, 6.7f, 2.2f, 1.4f };
		
		float temp;
		int start=0;
		int end=marks.length-1;
		
		while(start<end)
		{
			temp=marks[start];
			marks[start]=marks[end];
			marks[end]=temp;
			start++;
			end--;
		}
		
		for(int i=0;i<marks.length;i++)
		
			System.out.print(marks[i]+" ");
	}

}

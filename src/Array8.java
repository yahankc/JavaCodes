//Occurrence of element

public class Array8 {

	public static void main(String[] args) {
		int arr[] = { 23, 76, 54, 33, 11, 37, 99,11,11, 52,11 ,37};
		
		int count=0;
		
		int num=37;
		
		for(int element:arr)
		{
			if(element==num)
			{
				count=count+1;
			}
		}
		System.out.println("Occurrence of element: "+num+ " is occuring "+count+" times");
		
	}
}

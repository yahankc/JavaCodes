//*Merging two arrays
import java.util.Arrays;
public class Array_MergeTwoArrays {	
	public static void main(String[] args) {
		
		int a1[]= {1,4,6,8};
		int a2[]= {3,5,6,7,9};
		
		
		int size1=a1.length;
		int size2=a2.length;
		int size3=size1+size2;
		
		int a3[]=new int[size3];
		
		for(int i=0;i<size1;i++)
		{
			a3[i]=a1[i];
		}
		for(int j=0;j<size2;j++)
		{
			a3[size1+j]=a2[j];
		}
		
		for(int element:a3)
			System.out.print(element+" ");
	}

}

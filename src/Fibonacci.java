
//0 1 2 3 4 5 6
//0+1 1+2 3+3 6+4 10+5 15+6
//1,2,3,5,8,12,21

public class Fibonacci {
	
	public static void main(String[] args) {
		int n1=0,n2=1,n3;		
		
		for(int i=0;i<7;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}
	}

}

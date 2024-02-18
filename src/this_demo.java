
public class this_demo {
	
	int a=2; //global variable
	
	public void getdata()
	{
		int a=5;
		
		System.out.println(a);  
		System.out.println(this.a); 	//this refer to the global variable (at class level)
	}
	
	public void sum()
	{
		int a=7;
		int c= a+this.a;			//here with the help of this a=2 and a=7
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		this_demo th=new this_demo();
		
		th.getdata();
		th.sum();
	}
}


//multiple function having same name within a class
//either argument count should be diffrent
//either argument type should be different
public class FunctionOverloading {
	
	public void getdata(int a)
	{
		System.out.println(a);
	}
	public void getdata(String b)
	{
		System.out.println(b);
	}
	public void getdata(int a, int b)
	{
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		
		FunctionOverloading fo=new FunctionOverloading();
		fo.getdata(2);
		fo.getdata("Guss");
		fo.getdata(5,6);
	}

}


public class Super_Childclass extends Super_Parentclass {
	
	String name="Son Yahan";
	
	public void getdata()
	{
		System.out.println(name); // will refer to the local or child class variable
		System.out.println(super.name);  //super will refer to the parent's variable
	}
	
	public void viewdata()
	{
		super.viewdata();						// super will run the parent class method
		System.out.println("Child class method");
	}
	public static void main(String[] args) {
		
		Super_Childclass s=new Super_Childclass();
		s.getdata();
		s.viewdata();
	}

}

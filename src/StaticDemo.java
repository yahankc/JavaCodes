//Census application using static keyword
//Advantage: here all the objects are sharing the same memory i.e city which is static..so memory efficiency increases

public class StaticDemo {

	int age; // instance variable
	String address;
	static String city = "Mohali";

	StaticDemo(int age, String address) // constructor //here we're assigning the values to the instance variable
	{
		this.age = age;
		this.address = address;
		// this.city=city;
	}
	public static void getcity() 				//Static method
	{
		System.out.println(city);
	}


	public void getdata() {
		System.out.println(age + " " + address + " " + city);
	}

	public static void main(String[] args) {

		StaticDemo s = new StaticDemo(34, "Kharar");
		StaticDemo s1 = new StaticDemo(43, "Gharuan");
		StaticDemo s2 = new StaticDemo(18, "Gilco");

		s.getdata();
		s1.getdata();
		s2.getdata();
		getcity();   			//no need of object for calling static method/variable inside static method
	}

}

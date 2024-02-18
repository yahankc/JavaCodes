//Census application (without using static)

public class StaticDemo1 {

	int age; // instance variable
	String address;
	String city;

	StaticDemo1(int age, String address, String city)  //constructor  //here we're assigning the values to the instance variable
	{
		this.age = age;
		this.address = address;
		this.city = city;
	}
	
	public void getdata() {
		System.out.println(age + " " + address + " " + city);
	}

	public static void main(String[] args) {

		StaticDemo1 s = new StaticDemo1(34, "Kharar", "Mohali");
		StaticDemo1 s1 = new StaticDemo1(43, "Gharuan", "Mohali");
		StaticDemo1 s2 = new StaticDemo1(18, "Gilco", "Mohali");

		s.getdata();
		s1.getdata();
		s2.getdata();
	}
}


public class UnaryOperator {

	
	 
	public static void main(String[] args) {
		int i=2;
		int a=10;
		int b=10;
		System.out.println(i++);	 //2
		System.out.println(i); 			//3
		System.out.println(++i);      //4
		
		System.out.println(a++ + a++);   //10+11=20
		System.out.println(a++ + ++a);   //12+14=26
		
		System.out.println(++a +  b++); //15+10=25
		
	}
	
}

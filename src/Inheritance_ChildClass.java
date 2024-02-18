//Swift ZDI	(new model)
public class Inheritance_ChildClass extends Inheritance_ParentClass{
	
	public void colour()
	{
		System.out.println(colour);
	}
	
	public void engine()
	{
		System.out.println("Engine is implemented");		//new method is implemented here
	}
	public void clutch()									
	{
		System.out.println("Clutch is now automatic");		//function overriding
	}
	public static void main(String[] args) {
		
		Inheritance_ChildClass c=new Inheritance_ChildClass();
		c.colour(); // showing inheritance
		c.engine();
		c.gears(); // showing inheritance
		c.breaks(); // showing inheritance
		c.clutch();  //function overriding - always the child class method will run i.e. it is overriding the parent class method.
	}

}

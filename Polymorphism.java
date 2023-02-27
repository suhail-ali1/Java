
class MethodOverriding
{
	public void override()
	{
		System.out.println("Hii");
	}
	
}


public class Polymorphism extends MethodOverriding {

	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
	public void add(int a , double b)
	{
		System.out.println(a + b);
	}
	
	@Override 
	public void override()
	{
		System.out.println("Bye");
		
	}
	
	
	
	public static void main(String[] args) {
		
		Polymorphism obj = new Polymorphism();
		obj.add(3, 4.5);
		obj.add(500, 4);
		obj.override();
	}
	
	
	

}

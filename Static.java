
public class Static {
	
	static int i = 1;
	int a;
	int b;
	
	static void staticfunction()
	{
		System.out.println("I am Static function");
		// Non Static Member not allowed  = 1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(i);
		staticfunction();
		
		
	}
	
	static {
		System.out.println("Hello");
	}
	

}

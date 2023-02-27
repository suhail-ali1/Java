
public class TypeCasting {
	
	public static void main(String[] args) {
		
		byte a = 100;
		short b = a; // Implicit Type Casting
		System.out.println(b);
		
		int c = 400;
		b = (short)c; // Explicit Type Casting
		
		System.out.println(c);
	}

}

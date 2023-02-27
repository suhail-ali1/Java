import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		switch(x)
		{
		case 1: System.out.println("Hii"); 
		        break;
		case 2 : System.out.println("Hello");
		         break;
		         
		default : System.out.println("Invalid");
		            
		}
		
		
	}
	
}

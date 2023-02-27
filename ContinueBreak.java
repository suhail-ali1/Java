
public class ContinueBreak {

	public static void main(String[] args) {
		
		int x[] = {1, 2, 3, 4, 5, 6 };
		
		for(int value : x)
		{
			if(value == 3)
			{
				continue;
			}
			System.out.println(value);
		}
		
		for(int value1 : x)
		{
			System.out.println(value1);
			
			for( int value2 : x)
			{
				System.out.println(value2);
			     break;
			}
		}
		
		
	}
}

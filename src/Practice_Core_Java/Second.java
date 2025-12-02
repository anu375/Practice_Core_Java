package Practice_Core_Java;

public class Second 
{

	public static void main(String[] args) 
	{
		System.out.println("***ODD***");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i++);
		}
		System.out.println("******************");
		
		System.out.println("***EVEN***");
		for(int i=0;i<=15;i++)
		{
			System.out.println(i++);
		}
		
		System.out.println("********************");
		
		System.out.println("***WHILE LOOP***");
		int i = 1;
		while(i <= 5)
		{
		    System.out.println(i);
		    i++;
		}
		
		System.out.println("*********************");
		
		System.out.println("***DO WHILE LOOP***");
		int j = 1;
		do
		{
		    System.out.println(j);
		    j++;
		} while(j <= 5);
	}

}

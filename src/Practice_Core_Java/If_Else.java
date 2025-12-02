package Practice_Core_Java;

import java.util.Scanner;

public class If_Else 
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		if(marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		System.out.println("**************");
		
//		int marks = 77;
//		if(marks>=35)
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
	}

}

package Practice_Core_Java;

import java.util.Scanner;

public class User_Scanner
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}

}

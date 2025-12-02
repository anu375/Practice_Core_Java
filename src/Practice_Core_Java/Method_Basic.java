package Practice_Core_Java;

public class Method_Basic
{
	
	static String add_1(String a,String b)
	{
		return a+b;
	}
	
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int sub(int c,int d)
	{
		return c-d;
	}
	
	static int mul(int e, int f)
	{
		return e*f;
	}
	
	static double div(double a, double b)
	{
		return a/b;
	}
	
	
	public static void main(String[] args)
	{
		String ADD = add_1("10","20");
		System.out.println("Add = "+ADD);
		
		int Addition = add(10,20);
		System.out.println("Sum = " + Addition);
		
		int Substraction = sub(50,60);
		System.out.println("Sub = "+Substraction);
		
		int Multiplication = mul(10,20);
		System.out.println("Mul = "+Multiplication);
		
		double Division = div(20.0,2.0);
		System.out.println("Div = "+Division);
	}


}


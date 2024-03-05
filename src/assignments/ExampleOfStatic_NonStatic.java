package assignments;
//Assignment 1  Create a class and in this class 2 static method, 2 non-static method.
public class ExampleOfStatic_NonStatic 
{
	static void precondition()
	{
		System.out.println("Precondition");
	}
	static void condition()
	{
		System.out.println("Condition");
	}
	void multiplication()
	{
		System.out.println("Multiplication");
	}
	void division()
	{
		System.out.println("Division");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       precondition();
       condition();
       ExampleOfStatic_NonStatic n= new ExampleOfStatic_NonStatic();
       n.multiplication();
       n.division();
	}

}

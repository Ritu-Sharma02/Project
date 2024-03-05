package assignments;
//Execution of SIB,IIB,Main Method and parameterized Constructor
public class Assignment26 
{
	Assignment26(int a) //parameterized constructor
	{
		System.out.println(2);
	}
	static
	{
		System.out.println("This is my SIB");
	}
	{
		System.out.println("This is my IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("This is my main method");
		new Assignment26(0);
		
	}

}

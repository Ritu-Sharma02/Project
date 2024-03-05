package assignments;
//Order of execution of SIB,IIB,Main Method and Constructor by creating object 2 times
public class SIB_IIB_Constructor_MainMethod 
{
	SIB_IIB_Constructor_MainMethod()
	{
		System.out.println("This is my constructor");
		System.out.println("This is my constructor");
	}
	static
	{
		System.out.println("This is my SIB");
		System.out.println("This is my SIB");
	}
	
	{
		System.out.println("This is my IIB");
		System.out.println("This is my IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("This is my main method");
		new SIB_IIB_Constructor_MainMethod();
		SIB_IIB_Constructor_MainMethod a=new SIB_IIB_Constructor_MainMethod();
	}

}

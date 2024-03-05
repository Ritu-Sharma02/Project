package assignments;
//Create class and create 4 methods(add,sub,mul,div),
//add 2 variables in each method but the input should 
//come from scanner class for all methods.
import java.util.Scanner;

public class Assignment27 
{
	static void add()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		int c=a+b;
		System.out.println("Addtion of two numbers: ");
		System.out.println(c);
	}
	static void sub()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		int c=a-b;
		System.out.println("Subtraction of two numbers: ");
		System.out.println(c);
	}
	static void mul()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		int c=a*b;
		System.out.println("Multiplication of two numbers: ");
		System.out.println(c);
	}
	static void div()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		int c=a/b;
		System.out.println("Division of two numbers: ");
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();	
	}

}

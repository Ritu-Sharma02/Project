package assignments;
//Create class and create 4 methods(add,sub,mul,div),add 2 variables but the input should come from scanner class 
//by creating only one  object
import java.util.Scanner;

public class Ritu
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
	 void div()
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
		Ritu m1=new Ritu();
		m1.div();
		add();
		sub();
		mul();
		
	}

 }


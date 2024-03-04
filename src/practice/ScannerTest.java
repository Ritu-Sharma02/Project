package practice;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=s.nextInt();
		s.nextInt();
	}

}

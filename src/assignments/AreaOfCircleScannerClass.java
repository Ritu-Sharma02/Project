package assignments;

import java.util.Scanner;

//Find out the Area of a circle,where "r " should be come from scanner class
public class AreaOfCircleScannerClass {

	public static void main(String[] args) 
	{
		double radius;
		radius=8;
		double pi=3.14, area;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter area of circle:");
		radius = s1.nextDouble();
		area = pi*radius*radius;  
        System.out.println("Area of circle is: "+area);  
	}

}

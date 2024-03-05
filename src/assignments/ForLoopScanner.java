package assignments;
//Print values 1 to 100 using for loop, but in this 1 and 100 should be come from scanner class
import java.util.Scanner;

public class ForLoopScanner 
{
	
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		  for (int i=1;i<=100;i++)
		  {
			  int a=s1.nextInt();
			  System.out.println(i);  
		  }

	}

}

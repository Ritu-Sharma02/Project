package assignments;
//Print numbers from 1 to 500,then check if the number is 
//divible by 3 Print "Computer", if the number is divible 
//by 5 Print "Mouser",  if the number is divible 
//by both 3 & 5 Print "Computer & Mouse"
public class Assignment22 
{

	public static void main(String[] args) 
	{
		  for(int i=1; i<=500; i++)
		{
			if(i%3==0)
			{
				System.out.println("Computer"+i);
			}
			if(i%5==0)
			{
				System.out.println("Mouse"+i);
			}
			if(i%3==0 && i%5==0)
			{
				System.out.println("Computer && Mouse");
			}

	     }
	}
}
	

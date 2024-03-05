package assignments;
//Inside one if you have to play multiple if block.
public class Assignment16 {

	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		int c=300;
		if (a<b)
		{
		   if(a>500) //false
		   {
			   if(a>1000) //false
			   {
				   System.out.println("Logic1");
			   }
			   if(a>700)
			   {
				   System.out.println("Logic6");
			   }
			   else
			   {
				   System.out.println("Logic4");
			   }
			   if(b<300) //true
			   {
				  System.out.println("Logic5");
		       }
		   else
		   {
			   System.out.println("Logic2");
		   }
		}
		else
		{
			 System.out.println("Logic3");
		}

	}

	}

}

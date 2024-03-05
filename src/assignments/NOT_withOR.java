package assignments;
//Check NOT with OR
public class NOT_withOR {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		if(!(a>10 || b>a))  //f-t=T with ! operator it turn to f. So no output
		{
			int sum=100+a+b;
			System.out.println(sum);
		}
		if(!(a>15 || a>b))  //f-f=f with ! operator it turn to T. So output is showing.
		{
			int sum=10+a+b;
			System.out.println(sum);
		}

	}

}

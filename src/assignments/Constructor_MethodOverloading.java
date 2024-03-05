package assignments;
//Assignment4 Constructor and Method overloading
public class Constructor_MethodOverloading 
{
	Constructor_MethodOverloading (int a, double b)
   {
	   System.out.println("1,2.3");
   }
	static void add(int a, double b, int c)
	{
		System.out.println(1);
		System.out.println(2.3);
		System.out.println(4);
		double d=a*b*c;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		new Constructor_MethodOverloading(0,1);
		add(1,2.3,4);
      
	}

}

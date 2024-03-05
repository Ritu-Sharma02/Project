package assignments;
// Assignment 3 Method overloading
public class Assignment_MethodOverloading 
{
    void add(int a, int b, double c) //Non-static 
    {
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
    	double d =a*b*c;
    	System.out.println(d);
    }
    void add(double a, int b, int c) //Non-static
    {
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
    	double d =a*b*c;
    	System.out.println(d);
    }
    void add(int a, double b, int c) //Non-static
    {
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
    	double d =a*b*c;
    	System.out.println(d);
    }
    static void sub(String a, char b)
    {
    	System.out.println(a);
    	System.out.println(b);
    	
    }
    static void sub(char a, String b)
    {
    	System.out.println(a);
    	System.out.println(b);
    	
    } 
	public static void main(String[] args)
	{	
		Assignment_MethodOverloading a = new Assignment_MethodOverloading();
		a.add(1,2,1.3);
		a.add(2.3,5,8);
		a.add(4,8.9,6);
        sub("Ritu",'S');
        sub('R',"Sharma");
	}

}

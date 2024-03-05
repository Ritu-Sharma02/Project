package assignments;
//Create 5 interface in one class.
interface Case1
{
	void add();
}
interface Case2
{
	void sub();
}
interface Case3
{
	void mul();
}
interface Case4
{
	void div();
}
interface Case5
{
	void percentage();
}
public class Assignment_MultipleLevel_Inheritance implements Case1,Case2,Case3,Case4,Case5
{
	static void area()
	{
		System.out.println("Area");
	}
	void length()
	{
		System.out.println("Length");
	}

	static void currency()
	{
		System.out.println("Currency");
	}
	public static void main(String[] args) 
	{
		Assignment_MultipleLevel_Inheritance a1=new Assignment_MultipleLevel_Inheritance();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.percentage();
		area();
		a1.length();
		currency();
		
	}

	@Override
	public void percentage() 
	{
		System.out.println("Percentage");	
		
	}

	@Override
	public void div()
	{
		System.out.println("Divsion");	
		
	}

	@Override
	public void mul() 
	{
		System.out.println("Multiplication");	
		
	}

	@Override
	public void sub()
	{
		System.out.println("Subtraction");
	}

	@Override
	public void add() 
	{
		System.out.println("Addition");
		
	}

}

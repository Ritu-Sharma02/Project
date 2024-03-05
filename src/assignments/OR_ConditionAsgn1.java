package assignments;
//play with all OR condition
public class OR_ConditionAsgn1 {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		if(a<b || b>10)  // T - T=T
		{
			int sum=100+a+b;
			System.out.println(sum);
		}
		if(a>5 || a>b)  //T - F=T
		{
			int sum=10+a+b;
			System.out.println(sum);
		}
		if(a>30 || b>a)  //F - T=T
		{
			int sum=20+a+b;
			System.out.println(sum);
		}
		if(a>30 || b<a)  // F - F=F
		{
			int sum=20+a+b;
			System.out.println(sum);
		}

	}

}

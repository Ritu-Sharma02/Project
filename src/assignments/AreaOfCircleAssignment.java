package assignments;
//Find Area of circle by making "pi" as Global and Final variable
public class AreaOfCircleAssignment 
{
	   static double pi=3.14;  //pi as global variable
	 final static double pi1=3.14;  //pi as final variable
	public static void main(String[] args)
	{
		double radius;
		radius=8;
		double area ;
		pi=3.14;
		area = pi*radius*radius;  
        System.out.println("Area of circle is: "+area); 
        radius =8;
        //pi1=20;  // In this it will give the error that remove the final
        area=pi1*radius*radius; 
        System.out.println("Area of circle is: "+area);  

	}

}

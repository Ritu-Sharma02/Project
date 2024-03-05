package assignments;
//Assignment2 Example to create constructor

public class Constructor 
{
 Constructor()  
 {
	 System.out.println("This is my first constructor");
 }
  Constructor(int a)
  {
	  System.out.println("2");
  }
  Constructor(boolean a)
  {
	  System.out.println("True/False");
  }
  Constructor(String a)
  {
	  System.out.println("abc");
  }
  Constructor(char a)
  {
	  System.out.println("A");
  }
  
	public static void main(String[] args) {
      new Constructor();	//Non parameterized constructor	
      new Constructor(0);   //int a Parameterized constructor
      new Constructor(true);   //boolean a
      new Constructor("");   //string a
      new Constructor('a');   //char a
	}

}

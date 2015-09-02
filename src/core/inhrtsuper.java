package core;

public class inhrtsuper {
	public int length;
	public static int age=10;
	//String name;
	
	public void setlength(int a)
	{
		length=a;
		System.out.println("length in parent is "+length);
	}
//public void printL(){
		
	//	System.out.println("super");
	//}
	public int perimeter()
	{
		//length=a;
		System.out.println("in super perimeter method");
	int	p=length;
		return p;
	}

}

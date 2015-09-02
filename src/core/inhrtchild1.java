package core;

public class inhrtchild1 extends inhrtsuper{
	private int breadth=5;
	/*public void setlength(int a)
	{
		length=a;
		System.out.println("length in child is "+length);
	}*/
	public void setbreadth(int b)
	{
		breadth=b;
		System.out.println("breadth in child is"+b);
	}
	public int perimeter()
	{
		int p;
		//breadth=b;
		//System.out.println("length in child  method is "+length);
		System.out.println("in child perimeter method");
		p=super.length+breadth;
		return p;
	}
	


	public int area()
	{
		return 10;
	}
}

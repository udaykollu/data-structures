package core;

public class inhrt {
	public static void main(String[] a)
	{
	//	inhrtsuper obj= new inhrtsuper();
		inhrtchild1 obj1=new inhrtchild1();
		inhrtsuper any;
		inhrtchild1 any1;
		any=new inhrtchild1();
//obj.setlength(1)	;
//		int perimeter=obj.perimeter();
//		System.out.println("perimeter in super"+perimeter);
		obj1.setlength(2)	;
		obj1.setbreadth(3)	;
	int	perimeter=obj1.perimeter();
		System.out.println("perimeter in child object case is "+perimeter);
		
		//perimeter=any.perimeter();
		//int area=any.area();
		any.setlength(4);
		//System.out.println("length is"+any.length);
	//	any.setbreadth(3);
		perimeter=any.perimeter();
		System.out.println("perimeter in mixed case is "+ perimeter);
		//System.out.println(any.length);
		
		//obj1.superL();
			
 any1=(inhrtchild1) any ;
int area1=any1.area();
System.out.println("area is"+ area1);
System.out.println(inhrtsuper.age);
}
}
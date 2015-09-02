package core;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//import java.util.ArrayList;
public class ActivitySelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("enter number of products");
try
{
BufferedReader br =new BufferedReader(new FileReader(new File("Test.txt")) );
//int total=9;
String s=br.readLine();
System.out.println("main string is"+ s);
String []a=s.split(" ");
//products product = new products();
products[]  productArray =new products[a.length]; 
TreeMap<Integer, products> objTree =new TreeMap<Integer,products>();
String v=null;
//int i=0;
for(String k : a)
{
String []b =k.split(":");

//productArray[i]= new products(b[0],Integer.parseInt(b[1]),Integer.parseInt(b[2]));
products p =new products(b[0],Integer.parseInt(b[1]),Integer.parseInt(b[2]));
objTree.put(p.FinishTime, p);
//i++;

}
int temp=objTree.firstKey();
v= (objTree.get(temp)).name;

//for( i=0;i<total-1;i++)
//{
//	if(productArray[i+1].StartTime>=productArray[p].FinishTime)
//	{v=v+productArray[i+1].name;
//	p= i+1;
//	}
//	
//}
Set set = objTree.entrySet();
Iterator iterator = set.iterator();
while(iterator.hasNext()) {
	Map.Entry mentry = (Map.Entry)iterator.next();
products pr=(products)mentry.getValue()	;
if(pr.StartTime>= temp)
{
v=v+"  "+pr.name;
temp= pr.FinishTime;
}


}//while loop


System.out.println("the selected ones are"+v);
}//try
catch(Exception e)
{}

finally
{
}

}

}

	

class products
{
 String	name;
 int StartTime;
 int FinishTime;

public products(String name, int st, int ft)
{
this.name=name;
this.StartTime=st;
this.FinishTime= ft;
}
//public String name()
//{
//	return this.name;
//}
//public void name(String product_Name)
//{
//	this.name=product_Name;
//}
//
//public int StartTime()
//{
//	return this.StartTime;
//}
//public void StartTime(int a)
//{
//	this.StartTime=a;
//}
//public int FinishTime()
//{
//	return this.FinishTime;
//}
//public void FinishTime(int a)
//{
//	this.FinishTime=a;
//}
//
}

package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class binarySubstraction {
	public static void main(String a[])
	{
	System.out.println("enter two binary numbers");
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	try{
	String value1=br.readLine();
	String value2=br.readLine();
	String Total=addition(value1,value2);
	System.out.println("Sum of two binary numbers is"+Total);

	if(greater(value1,value2))
	{
		String remainder=substraction(value1,value2);
		System.out.println("Substraction of "+value2+"from"+value1+"is"+remainder);

	}
	else
		System.out.println("First value is smaller than second value cannot perform substraction");
	}
	catch(IOException e)
	{System.out.println("IO exception"+e);}
	}


public static String twocompliment(String a)
{
String r = null;
for(int i=0;i<a.length();i++)
{
	if(Character.getNumericValue(a.charAt(i))==1)
	{
		if(r==null)
			r="0";
		else
		r=r+"0";
	}
	else
	{
		if(r==null)
			r="1";
		else
			r=r+"1";
		}
	
}

r=addition(r,"1");

	return r;
}
public static boolean greater(String a,String b)
{
	if(Integer.parseInt(a)>Integer.parseInt(b))
	return true;
	else
		return false;
}

public static String substraction(String a,String b)
{
	String c=twocompliment(b);
	String remainder=addition(a,c);
	if(remainder.length()==a.length())
	return remainder;
	else
		return remainder.substring(1,remainder.length());
}

public static String addition(String a,String b)
{
	String total = null;
	int carry=0;
	//char [] achar= a.toCharArray();
	//char [] bchar=b.toCharArray();
	int alength= a.length();
	int blength=b.length();
	int differenceinLength=alength-blength;
	if(differenceinLength!=0)
	{
	String c="0";
	for(int i=0;i<differenceinLength-1;i++)
	{
		c=c+"0";
	}
	b=c+b;
	}
	
	for(int i=alength-1;i>=0;i--)
	{
	if((Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))+carry)==0)
	{
		if(total==null)
		total="0";
		else
		total=total+"0";
		carry=0;
	}
	else if((Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))+carry)==1)
	{
		if(total==null)
			total="1";
		else
		total=total+"1";
		carry=0;
		
	}
	else if((Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))+carry)==2)
	{
		if(total==null)
			total="0";
		else
		total=total+"0";
		carry=1;
		
	}
	else if((Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))+carry)==3)
	{
		if(total==null)
			total="1";
		else
		total=total+"1";
		carry=1;
		
	}
	
	
     }
	if(carry==1)
	{total=total+"1";}
	
	return new StringBuilder(total).reverse().toString();

   }
}
package core;
import java.io.*;
public class recursveStrn {
	static String str;
//needs lot of improvement in efficiency....
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String finl=reverseStrng(s);
   System.out.println("Final output is"+finl);
	}
	
	
	static String reverseString(String a)
	{
		//String str=null;
		int l=a.length();
		System.out.println("length is "+l);
		if(l>0)
		{
			//char temp = a.charAt(l-1);
			str=str+a.charAt(l-1);
			reverseString(a.substring(0, l-1));
		}
		
		
		return  str.substring(4);
		
	}
	
	static String reverseStrng(String a)
	{
		System.out.println("string input is"+a);
		int l=a.length();
		System.out.println("length is "+l);
		char []b = null;
		if(l>1)
		{
			
			b[l-1]=a.charAt(0);
			System.out.println("inside if for length"+l+"bvalue is"+   b[l-1]);
			reverseStrng(a.substring(1));
		}
		b[l-1]=a.charAt(0);
		System.out.println("inside if for length"+l+"bvalue is"+   b[l-1]);
		
		//for(int i=0;i<4;i++)
			//System.out.print(b[i]);
		
		
		a=String.valueOf(b);
		//System.out.println(a);
		return a;
		
		
	     }
	
	
	

}

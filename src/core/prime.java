package core;
import java.io.*;
import java.util.ArrayList;

public class prime {
	
	  static int count;
	  static ArrayList<Integer> pr =new ArrayList<Integer>();
	  static boolean b;
      
	public static void main(String[] args) throws IOException 
	{
		long startTime = System.nanoTime();
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)) ;
		String s= br.readLine();
		int n=Integer.parseInt(s);
		primes(n);
		System.out.println(count);
		
			
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
	}
	
static void primes(int m) 
  {
	for(int i=2;i<=m;i++)
	{
	b=true;
	for(int j=0;j<Math.sqrt(i);j++)
	    
	    {
		if((i%pr.get(j))==0)
		 {
		b=false;	
		break;
		 }
		}
	if(b==true)
		
	{
		count++;
		pr.add(i);
		
	}
	}
	
	
  }

}		
    
package core;
import java.io.*;

public class str2numImp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(br.readLine());
		String line2=br.readLine();
		String[] a=line2.split(" ");
		int k[]=new int[number];
		int i=0;
		for(String s:a)
		{
			try{
			//System.out.println(s);
			k[i]=Integer.parseInt(s);
			System.out.println(k[i]);
			i++;
		      }
		    catch (Exception e)	
		    {
		    	System.out.println("exception came");
		    }
		     
		}	
			
			
			
			for(i=0;i<number-2;i++)	
	{
		if((k[i]-k[i+1])!=k[i+1]-k[i+2])
				{
			System.out.println((k[i+1]+k[i+2])/2);
				}
		
	}

	/*for(i=0;i<number;i++)
	{
		System.out.println("in final print"+k[i]);
	}*/
		}

}

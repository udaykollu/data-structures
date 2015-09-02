package core;

import java.util.ArrayList;
import java.io.*;

public class arraylst {

	public static void main(String[] args) throws IOException {
		int i=0;
		int n=3;
		ArrayList<Integer> a=new ArrayList<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(i=0;i<n;i++)
		{
			
			try{
		
			a.add(Integer.parseInt(br.readLine()));
			}
			catch(Exception e)
			{System.out.println(e.getMessage());}
			
		
		}
		a.add(null);
		
		i=0;
		while(a.get(i)!=null)
		{
			System.out.println(a.get(i));
			i++;
					}
	}

}

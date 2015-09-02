package core;

import java.util.HashMap;
import java.io.*;

public class hashmp {
static HashMap<String,Integer> a=new HashMap<String,Integer>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println(input);
		int c;
		String i;
		File f=new File("abc.txt");
	BufferedReader br=new BufferedReader(new FileReader(f));
	BufferedReader bi=new BufferedReader(new InputStreamReader(System.in));
	String input=br.readLine();
	while((i=br.readLine())!=null)
	input=input+" "+i;
	br.close();
	System.out.println("input is"+input);
	String []pinput=input.split(" ");
	
	//System.out.println("input after split"+pinput);
	for(String k: pinput)
	{
	    if(a.containsKey(k))
	    {
	    	c=a.get(k);
	    	a.put(k,c+1);
	    }
	    else
		a.put(k, 1);
	}
		
		
	String test=bi.readLine();
	
	
	if(a.containsKey(test))
	{
	System.out.println("String match");
	}
	else
		System.out.println("no match");
		

	
	
	
	System.out.println(a)	;
}

}

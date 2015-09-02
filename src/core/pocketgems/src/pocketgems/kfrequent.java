package pocketgems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class kfrequent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter string ")	;
		int value;
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		try {
			String s = br.readLine();
		
			HashMap<String, Integer> hm= new HashMap<String, Integer>();
			String [] words = s.split(" ");
			for(String k : words)
			{
				System.out.println("word is"+k);
				if(hm.containsKey(k))
				{ 
				
					value=1+hm.get(k);
					hm.put(k, value);
				
				}
				else
					hm.put(k, 1);
			}
			for (HashMap.Entry<String, Integer> entry : hm.entrySet()) {
				
			    System.out.println("pp"+entry.getKey()+" : "+entry.getValue());
			}

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
}

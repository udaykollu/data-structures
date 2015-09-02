package core;
import java.io.*;
import java.util.*;
public class addstoN {
	
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h=new HashSet<Integer>();
		String s;
		try {
			s = br.readLine();
		
		int sum=5;
		String b[]=s.split(",")	;
		for(String k:b)
		{
			h.add(Integer.parseInt(k));
		}
		for(int l:h)
		{
			if(h.contains(sum-l))
				count++;
			
		}
		System.out.println("count is"+count/2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}

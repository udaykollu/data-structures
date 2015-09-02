package core;
import java.io.*;
import java.util.regex.*;

public class regularexp {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String s[]=str.split("[a-z]{2-20},[a-z]{2-20},[a-z]{2-20},[0-9]{1}");
		for(String k:s)
			System.out.println(k);
		
		
	}

}

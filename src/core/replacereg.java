package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class replacereg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		String output=input.replaceAll("/[a-z]{0,30}.{0,30}/", "/");
		System.out.println("output is"+output);
	
	}

}

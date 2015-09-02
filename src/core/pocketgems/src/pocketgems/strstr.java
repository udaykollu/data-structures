package pocketgems;


////////////////////////////////////////////////////////////////////////////
////////////////////////////naive.....  use kmp   ///////////////////////////
/////////////////////////////////////////////////////////////////////////////
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class strstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter string ")	;
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			String ss=br.readLine();
			String status="NM";
			int location=s.length()+ss.length();
			System.out.print(" string "+s+""+ss);
			int j=0;
			for (int i=0;i<=s.length()-ss.length();i=i)
			{
				if(j==ss.length())
				{
					status="M";
					location=i;
					break;
				}
				if(s.charAt(i+j)==ss.charAt(j))
				j++;
				else
				{j=0;i++;}
			}
			
		if(status=="M")
		{System.out.println("First occurence of string at"+location);}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

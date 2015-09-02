package core;
import java.io.*;
import java.util.HashMap;
public class removeredundantchar {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
HashMap<String,Integer> h=new HashMap<String,Integer>();
String s=br.readLine();
s=s.replaceAll(" ","");
String []a=s.split("");

for(String k:a)
{
	if(h.containsKey(k))
	h.put(k,2);
		else
		h.put(k,1);
}
System.out.println(h.keySet());

String r=h.toString();
System.out.println("String"+r);
	
	}
	

}

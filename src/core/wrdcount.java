package core;


//////Read HasMap and Find No.of times repeating....twitter trends
//gives no.of unique words
import java.io.*;
public class wrdcount {
	static int count;

	public static void main(String[] args) throws Exception {
		File f=new File("abc.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		boolean bb=true;
		String s=br.readLine();
		String []a=s.split(" ");
		int i=0;
		for(String b:a)
		{System.out.println("word is"+b);
			for(int j=0;j<i;j++)
			{bb=true;
				if(b.equals(a[j]))
				{
					bb=false;
					break;
				}
				
				
			}
			if(bb==true)
				count++;
			i++;
		}
		System.out.println(count);
	}

}


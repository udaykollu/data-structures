package core;
import java.io.*;

public class strngrvrse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
s=s.replaceAll(" ","");
//StringBuffer sb=new StringBuffer().append(s);
//System.out.println(sb);
char temp;
int i=0,j;
j=s.length();
j=j-1;
System.out.println("length minus 1 is"+j);
/*while(i<j)
{
temp=sb.charAt(i);
sb.insert(i, sb.charAt(j));
sb.insert(j, temp);
i++;
j--;
}*/
char[] a=s.toCharArray();
while(i<j)
   {
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	i++;j--;
	
	}
System.out.println(a);
	
	}

}

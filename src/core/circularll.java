package core;
import java.io.*;
public class circularll {

	public static void main(String[] args) throws Exception{
		
		ll x=new ll();
		ll head=x;
		System.out.println("enter total no.of people");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		x.llset(1);
		ll temp;
		
				
		
		for(int i=0;i<n-1;i++)
		{
			//System.out.println("new loop");
			x=(x.next=new ll());
			x.llset(i+2);
			//System.out.println("value entered is"+x.getdata());
		}
		x.next=head;
		
		System.out.println("enter nth element to delete");
		int m=Integer.parseInt(br.readLine());
		while(x.next!=x)
		{  System.out.println("o/p is"+x.getdata());
			for(int k=0;k<m-1;k++)
			{x=x.next;}
			x.next=x.next.next;
			
		}
		System.out.println("o/p"+x.getdata());
		
		
		/*x=head;
		while(x!=null)
		{
			System.out.println("o/p is"+x.getdata());
			
		x=x.next;
	   }*/
		
		
		
	}

}

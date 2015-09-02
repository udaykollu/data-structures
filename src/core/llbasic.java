package core;

import java.util.Scanner;
//Wrong...
public class llbasic {
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		ll x=new ll();
		ll head;
		int i;
	    head=x;
		System.out.println("enter no.of values");
		int n=s.nextInt();
		for(i=0;i<n-1;i++)
		{
			x=(x.next=new ll());
	    }
		x.next=head;
	
	System.out.println("enter m th number to delete");
	int m=s.nextInt();
	//x=head;
	while(x!=x.next)
	{
		for(i=1;i<m;i++)
		{
			x=x.next;
		}
		//x.next=null;
		
		x.next=x.next.next;
		x.display1();
		
	}
	
	}
		
		
		
		
	}
	

package core;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class merge {
	static int a[]=new int[5];
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no.of values");
		int n=Integer.parseInt(br.readLine());
		System.out.println("enter values");

		for (int i=0;i<5;i++)
			a[i]=Integer.parseInt(br.readLine());
		int p=0;
		int r=a.length-1;
		
		divide(a,p,r);
		  for(int i=0;i<5;i++)
		    {
		    	System.out.println("final array i"+i+"is"+a[i]);
		    	
		    }

	}
	
	
	static void divide(int a[],int p,int r)
	{
		int q;
		System.out.println("p in divide  is"+p);
		System.out.println("r in divide  is"+r);

		if(p<r)
		{
			 q= (p+r)/2;
		
		divide(a,p,q);
		
		
	divide(a,q+1,r);
		
		conquer(a,p,q,r);
		}
		
	return;
	}
	
	static void conquer(int a[],int p,int q,int r)
	{
	//	System.out.println("p is"+p);
	//	System.out.println("q is"+q);
	//	System.out.println("r is"+r);


		int n1=q-p+1;
		int n2=r-q;
		//int n=a.length;
		int b[]=new int[n1];
		int c[]=new int[n2];
	    for(int i=0;i<n1;i++)
	    	b[i]=a[i+p];
	    for(int i=0;i<n2;i++)
	    	c[i]=a[i+q+1];
	    int j=0,k=0;
	  //  for(int i=0;i<n1;i++)
	    //	System.out.println("b is"+b[i]);

	   // for(int i=0;i<n2;i++)
	    //	System.out.println("c is"+c[i]);
	    int i=0;
	    while(j<n1 && k<n2)
	    {
	    	//System.out.println("i is"+i+"j is "+j+"k is"+k);
	    	
	    	if(b[j]<c[k])
	    	{
	    		a[i]=b[j];
	    		j++;
	    		i++;
	    	}	
	    	else
	    	{
	    		a[i]=c[k];
	    		k++;
	    		i++;
	    	}
	    	}
	   /* else
	    {
	    if(k<n2)
	    	a[i]=c[k];
	    else
	    	a[i]=b[j];
	    }*/
	    //	}
	  
	  for( i=0;i<a.length;i++)
	  {
		  
		 
		    	System.out.println("afer one iteration "+a[i]);
		    
	  }
	    
	    		
	}
}

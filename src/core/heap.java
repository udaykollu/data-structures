package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class heap {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of values");
		int n=Integer.parseInt(br.readLine());
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		buildMaxHeap(a);
		
		for(int i=0;i<n;i++)
		{
			System.out.println("final array is"+a[i]);
		}
		heapSort(a);
		

	}
	
	
	static void buildMaxHeap(int a[])
	{
		int len=a.length;
		//int heapSize=len;
		for(int i=(len/2-1);i>=0;i--)
		{
			System.out.println("max heapify called for"+i+"time");
			maxHeapify(a,i,len);
		}
			return;
	}
	static void maxHeapify(int a[],int i,int len)
	{
		System.out.println("in maxheapify a[i]"+a[i]+" at   "+i);
		int l=2*i+1;
		int r=l+1;
		int largest;
		
		
		if((l<len) && (a[l]>a[i]))
		{
		 largest = l;
		}
		else 
			largest=i;
		
		if(r<len && a[r]>a[l])
		{
			largest=r;
		}
		
		
		if(largest!=i)
		{
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			maxHeapify(a,largest,len);
		}
		
	}	
	static void heapSort(int a[])
	{
		int len=a.length;
		int temp;
		for(int i=len-1;i>=1;i--)
		{
			temp=a[i];
			a[i]=a[0];
			a[0]=temp;
			len--;
			maxHeapify(a,0,len);
		}for(int i=0;i<a.length;i++)
		{
			System.out.println("final array is after heap sort "+a[i]);
		}
		
		
		return;
	}
	

}

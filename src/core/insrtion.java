package core;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class insrtion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter no.of values");
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("enter values");

for (int i=0;i<n;i++)
	a[i]=Integer.parseInt(br.readLine());
	

for(int i=1;i<n;i++)
{
	int temp=a[i];

	int j=i-1;
	while(j>=0 && a[j]>temp)
		
	{
		a[j+1]=a[j];
		j--;
		
	}

a[j+1]=temp;
}
	for(int i=0;i<n;i++)
		System.out.println("values are" + a[i]);

	
	
	
	
	}

}

package core;
import java.io.*;
public class knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight;
		String fnal=null;
		try{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter capacity ");
int capacity= Integer.parseInt(br.readLine());
System.out.println("enter no.of products ");
int products= Integer.parseInt(br.readLine());
int input[][]= new int[products][capacity];
int values[][]= new int[products+1][capacity];
int keep[][]= new int[products+1][capacity];
System.out.println("enter value and weights ");
for(int i=0;i<products;i++)
{
		input[i][0]=Integer.parseInt(br.readLine());
		input[i][1]=Integer.parseInt(br.readLine());
		
	
}

for(int i=0;i<products+1;i++)
{
	for(int j=0;j<capacity;j++)
	{
		if(i==0)
		{
		values[i][j]=0;
		keep[i][j]=0;
		}
		else
		{
			if(input[i-1][1]>j+1)
			{
				
			values[i][j]=values[i-1][j];
			keep[i][j]=0;
            }
			else
			{
				values[i][j]=input[i-1][0];
				weight=j+1-input[i-1][1];
				if(weight>0)
				values[i][j]=values[i][j]+values[i-1][weight-1];
				keep[i][j]=1;
				if(values[i][j]<values[i-1][j])
				{values[i][j]=values[i-1][j];
				keep[i][j]=0;}
			}
		}
		
	}
}

System.out.println("values are");
for(int i=0;i<products+1;i++)
{System.out.println("\n");
	for(int j=0;j<capacity;j++)
{System.out.println(values[i][j]);
	}
}

System.out.println("keep is");
for(int i=0;i<products+1;i++)
{System.out.println("\n");
	for(int j=0;j<capacity;j++)
{System.out.println(keep[i][j]);
	}
}
int i=products;
int j=capacity;
while(capacity>0 && i>=0 && j>=0)
{
	if(keep[i][j-1]==1)
	{
		fnal=fnal+i;
		i--;
		j--;
	}
	else
	{
		i--;
	}
}

System.out.println("final string is"+ fnal);
		}
		catch(IOException ie)
		{System.out.println("knapsack exception "+ ie);
}
	}

}

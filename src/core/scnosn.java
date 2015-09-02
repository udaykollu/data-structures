package core;

public class scnosn {
static int sum[] =new int[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= new int[5];
for(int i=0;i<5;i++)
{a[i]=i+1;
System.out.println(a[i]);
}
int i,j;

for(i=0;i<=(5-3);i++)
{
	for( j=0;j<3;j++)
	{
		sum[i]=sum[i]+a[i+j];
	}
	//j=0;
}
for( i=0;i<4;i++)
{System.out.println(sum[i]);
}






}
		
		
	}



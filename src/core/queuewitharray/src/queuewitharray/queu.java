package queuewitharray;

public class queu {

	int[]  q=  new int[3];
	int head=0;
	 int tail=0;
	public void queu()
	{
		
	}
	
	public void enqueue(int input)
	{
		if(tail>2)
		{
			throw new java.lang.ArrayIndexOutOfBoundsException();
		}
		else
		{
			q[tail]=input;
			tail++;
			System.out.println("tail is"+tail);
		}
	}
	
	public int dequeue() throws QueueEmpty
	{
		if(tail==0)
		{throw new QueueEmpty("QueueEmpty");}
		else
		{
			return reArrangeElements();
		}
	}
	
	public int reArrangeElements()
	{
		
		int temp =q[0];
		System.out.println("returned"+temp);
		for(int i=0;i< tail-1;i++)
		{
			q[i]=q[i+1];
		}
		tail--;
		return temp;
	}
}

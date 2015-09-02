package queuewitharray;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
queu q= new queu();
int temp=0;
try
{
q.enqueue(1);
q.enqueue(2);

}
catch(Exception e)
{System.out.println(e);
}

System.out.println("starting deque");
try
{

temp=q.dequeue();
temp=q.dequeue();
temp=q.dequeue();
//temp=q.dequeue();

}
catch(Exception e)
{System.out.println(e.getMessage());
}
	}

}

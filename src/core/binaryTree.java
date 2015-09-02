package core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class binaryTree {
	public static void main(String []a) throws Exception
 {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		createNode root = null;
		createNode[] n=new createNode[10];
		//createNode []n = null;
		Object h;
		for(int i=0;i<4;i++)
	 {
		System.out.println("enter key");
		 n[i]= new createNode(Integer.parseInt(br.readLine()));
		if(root==null)
		{
			root=n[i];
			System.out.println("root placed"+root.key);
		}	
		else
		{
		putt(root,n[i]);
		}
	  }
		display(root);
	}
	
	
		
	public static void traverse(createNode T)
{
	
}
public static void putt(createNode root,createNode n)
{
	Stack s=new Stack();
	s.push(root);
	while(!s.empty())
	{
		
	createNode h=	(createNode) s.pop();
	
	
	if(h.key>n.key)
	{
		
	if(h.l!=null)
	{
		s.push(h.l);
		System.out.println("left is nt null");
	}
	else
	{
		h.l=n;
		System.out.println("left placed"+h.l.key);
		return;
	}
	
	}
	else
		if(h.r!=null)
		{
			System.out.println("right is nt null");
		s.push(h.r);	
		}
		else
		{
	    h.r=n;
	    System.out.println("right placed"+h.r.key);
	    return;
		}
		
	}
}



public static void delete(createNode root, createNode temp)
{
	if(temp.key>root.key && root.r!=null)
		delete(root.r,temp);
	if(temp.key<root.key && root.l!=null)
		delete(root.l,temp);

	//now we reaches the element to be deleted now move right and call a method that goes left until it reaches null,that is our replecing element
	//if right element is null than we go left and call method to reach right until null if it is also null
	// it is leaf just delete it... :)
}




public static void display(createNode root)
{
	
	if(root.l!=null)
		display(root.l);
	System.out.println(root.key);
	if(root.r!=null)
		display(root.r);
	}

}


/*//class createNode
{
	int key;
	createNode l;
	createNode r;
	createNode(int a)
	{
		key=a;
	}


}*/

package basics;

/*2. i.Create a Student Hash Table to store n number of students with respect to their registration number. 
ii.Take registration number as input and remove respective student details.*/

import java.util.*;

class Student
{
	String name;
	String branch;
	int Rollno;

	public Student(String name,String branch,int Rollno)  //constructor
	{
		this.name=name;
		this.branch=branch;
		this.Rollno=Rollno;
	}
}

class hashtable
{
	Hashtable<Integer,Student> ht;
	public hashtable() //constructor
	{
		ht=new Hashtable<Integer,Student>();
	}

	public void put(int regno,Student s) //add method
	{
		ht.put(regno,s);
	}

	public String get(int regno) //get method
	{
		return ht.get(regno).name;
	}

	public void remove(int regno)  //method to delete
	{
		ht.remove(regno);
	}

//main
	
	
	public static void main(String[] args)
	{
		hashtable st=new hashtable();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int n=sc.nextInt();

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name of student");
			String name=sc.next();
			System.out.println("Enter student rollno");
			int Rollno=sc.nextInt();
			System.out.println("Enter branch of student");
			String branch=sc.next();
		
			System.out.println("Enter regno of student");
			int regno=sc.nextInt();
			Student s=new Student(name,branch,Rollno);
			st.ht.put(regno,s);
		}
		
		for (int i=1;i<=n;i++)
		{
			System.out.println(" name of student"+ st.get(i));	
		}
		
		System.out.println("Enter regno of student to be removed");
		int regno=sc.nextInt();
		System.out.println("removed student"+" "+ st.get(regno));
		st.remove(regno);
		
		
		//System.out.println("students list"+" "+st.get(regno));
		



	}
}


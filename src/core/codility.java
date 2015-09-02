package core;
//you can also use imports, for example:
//import java.math.*;
//you can also use imports, for example:
//import java.math.*;
import java.io.*;
import java.util.HashMap;
class codility {
 static int count;
 
 public static void main(String a[]) throws NumberFormatException, IOException
 {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter k value");
     int k=Integer.parseInt(br.readLine());
	 int A[]={3,5,7,6,3};
	int t=solution(k,A) ;
	System.out.println(t);
	 
 }
 
 public static int solution(int K, int[] A) throws NumberFormatException{
     
     HashMap<Integer,Integer> h =new HashMap<Integer,Integer>();
    int j;
     int p;
    // int qa[];
     int N=A.length;
     System.out.println("l is "+N);
     
     int i;
     for( i=0;i<N;i++)
     {
     h.put(i+1,A[i]) ;
         
   }
     System.out.println(h);
   for(i=0;i<N;i++)
   {
       p=A[i];
       System.out.println("p value"   + p);
       j=K;
       while(j<p)
       {
       if(h.containsValue(p-j))
       {
       count++;
        }
       j++;
       }
       
    }
   
     
     
    System.out.println(count+N) ;
    return 9;
     
     
     
     
     
     
 }
}

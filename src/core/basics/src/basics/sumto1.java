package basics;

public class sumto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
		double value = 0 ;
		float numerator, denominator;
		for( a=1;a<=9;a++)
		{
			
		   for( b=1;b<=9;b++)
		 
		   { 
			if(a!=b)   // elimating duplicates
		       for(c=1;c<=9;c++)
		       {
			   if(b!=c&& c!=a)  // elimating duplicates
			   for(d=1;d<=9;d++)
			   {
		    	 if(c!=d&& d!=b&& d!=a)  // elimating duplicates
			  	  for(e=1;e<=9;e++)
			      {
				  if(e!=d&& e!=c&& e!=b&& e!=a)   // elimating duplicates
				  	 for(f=1;f<=9;f++)
				     {
			    	 if(e!=f&& f!=d&& f!=c&& f!=b&& f!=a) // elimating duplicates
				       for(g=1;g<=9;g++)
				       {
			        	 if(g!=f&&g!=e&& g!=d&& g!=c&& g!=b&& g!=a)// elimating duplicates
				          for(h=1;h<=9;h++)
				                {
			        		    if(h!=g&&h!=f&&h!=e&& h!=d&& h!=c&& h!=b&& h!=a) // elimating duplicates
				                    for(i=1;i<=9;i++)
			                          {
				                       if(i!=h&&i!=g&&i!=f&&i!=e&& i!=d&& i!=c&& i!=b&& i!=a) // elimating duplicates
					                   {
				                    	   //Mathematically 
				                    	   //value =(a/10b+c)+ (d/10e+f) + (g/10h+i)
				                    	   //calculating numerator and denominator separately
					                  numerator= (100*a*e*h+100*b*d*h+10*a*f*h+10*d*c*h+10*a*e*i+10*b*d*i+a*f*i+d*c*i+100*b*g*e+10*b*f*g+10*c*e*g+c*f*g);
					                  denominator= ((10*h+i)*(100*b*e+10*b*f+10*c*e+c*f));
					                value= numerator/denominator;
					                  
					                //  System.out.println("the values are a is"+a+" b is"+b+" c is"+c+"d is "+d+"e is "+e+"f is "+f+"g is "+g+"h is "+h+"i is"+i);
					              	//  System.out.println("\n value is "+value);
		                          if(numerator==denominator)              
		                              {
		                            	 System.out.println("value is 1 ");
		                            	  System.out.println("the values are a is"+a+" b is"+b+" c is"+c+"d is "+d+"e is "+e+"f is "+f+"g is "+g+"h is "+h+"i is"+i);
							              	
		                            	  break;
		                            	  }
			                          }
			                          }

	                            }
			        	 
				       }
				     }
			      }
			   }
		       
		    }
		    
		   }
		   
       }
		
	
	}
	
}

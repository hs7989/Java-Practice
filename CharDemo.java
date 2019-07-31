

              
    public class CharDemo 
    {
          public static void main(String [] args)
          {
                 java.util.Scanner s = new java.util.Scanner(System.in);
  
                             char ch;
 
 		System.out.println("\n Enter any char : ");
    		   ch = s.next().charAt(0);                            

             	    if( ch >= 'a' && ch <='z' )
                            System.out.println(" Lower Case ");
             	   else if( ch >= 'A' && ch <='Z' )
                            System.out.println(" Upper Case ");
             	   else if( ch >= '0' && ch <='9' )
                            System.out.println(" Digit ");
                     else
  		System.out.println(" Other Char ");                    

           }
    }

    
    public class CommandLineDemo 
    {
          public static void main(String [] args)
          {
                     int a , b , c;
        
                  a = Integer.parseInt( args[0] );
                  b = Integer.parseInt( args[1] );
                  c = Integer.parseInt( args[2] );

                if( a > b && a>c)
                { 
 		System.out.println( "\n max =  "+a);
                    
              } 
               else if( b > c)
              { 
      		System.out.println( "\n max =  "+b);
              } 
             else
      		System.out.println( "\n max =  "+c);
 
           }
    }
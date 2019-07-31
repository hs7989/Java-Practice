

              
    public class Array1 
    {
          public static void main(String [] args)
          {
                 java.util.Scanner s = new java.util.Scanner(System.in);
      
                       int i,sum=0,size;
                   
                       System.out.println("\n Enter size :  ");    
                          size = s.nextInt();

                         int [] x = new int[ size ];
                      
                       System.out.println("\n Enter "+size+" integers :  ");    
                                    for( i=0 ; i<size ; i++)
                                    {
                                           x[i] = s.nextInt();
                                             sum += x[i];
                                    } 
		System.out.println("\n\n Sum => "+sum);
   	   
           }
    }


              
    public class Array2 
    {
          public static void main(String [] args)
          {
                 java.util.Scanner s = new java.util.Scanner(System.in);
                           int i,max,min,size;

                  System.out.println("\n Enter size : ");
                      size = s.nextInt();

                                 int [] x = new int[ size];

                  System.out.println("\n Enter "+size+" nums : ");
                      for(i=0 ;i<size ; i++)
                           x[ i ] = s.nextInt();      
      
                        max = min = x[0];

                            for( i =1 ; i<size ; i++)
                            {
                                 if( max < x[i])
                                 {
                                       max = x[i];
                                 }
                                 if(min > x[i])
                                 {
                                       min = x[i];
                                 }
                            }

                                                      
                             System.out.println("\n max = "+max);
                             System.out.println("\n min = "+min);
                     	   
           }
    }


              
    public class Array4 
    {
          public static void main(String [] args)
          {
                 java.util.Scanner s = new java.util.Scanner(System.in);
                           int i,size,num,pos;

                  System.out.println("\n Enter size : ");
                      size = s.nextInt();

                                      pos = size;
                      int x[] = new int [ size+1];

                  System.out.println("\n Enter "+size+" nums : ");
                      for(i=0 ;i<size ; i++)
                           x[ i ] = s.nextInt();      
      
                  System.out.println("\n Enter num : ");
                                 num = s.nextInt();

                       for(i=0 ; i<size ; i++)
                       {
                              if( num < x[i])
                              {
                                    pos = i;
                                     break;
                              }
                       }
 
                           for(i=size ; i>pos ; i--)
                           {
                                    x[ i ] = x[ i-1 ];                                 
                           }

                               x[pos] = num;

                            System.out.println("\n List after insertion :\n");
 
                                     for( i=0; i<=size ; i++)
                                     {
                                           System.out.print("  "+x[i]);
                                     }
                     	   
           }
    }
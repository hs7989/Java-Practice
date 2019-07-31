
    public class Array5
    {
          public static void main(String [] args)
          {
                 java.util.Scanner s = new java.util.Scanner(System.in);
                           int i,size,num,pos=-1;

                  System.out.println("\n Enter size : ");
                      size = s.nextInt();

                      int x[] = new int[size];

                  System.out.println("\n Enter "+size+" nums : ");
                      for(i=0 ;i<size ; i++)
                           x[ i ] = s.nextInt();      
      
                  System.out.println("\n Enter num : ");
                                 num = s.nextInt();

                             for( i=0 ;i<size ; i++)
                             {
                                             if( num == x[i])
                                             {
                                                    pos = i;
                                                     break;
                                             }
                             }


                            if( pos ==  -1)
                            {
                                   System.out.println("\n Num not found..");
                                            System.exit(0);
                            }

                                  x[pos] = 0;  // delete

                              for(i=pos ; i<size-1 ; i++)
                               {
                                      x[ i ] = x[ i +1];
                               }
                     	   
                                System.out.println("\n List after deletion : ");
                                        for(i=0 ; i<size-1 ; i++)
                                                   System.out.print("  "+x[i]);
           }
    }
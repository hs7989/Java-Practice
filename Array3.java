    public class Array3 
    {
          public static void main(String [] args)
          {
                 java.util.Scanner s = new java.util.Scanner(System.in);
                           int i,size,num,pos=0;

                  System.out.println("\n Enter size : ");
                      size = s.nextInt();

                      int x[] = new int  [size];

                  System.out.println("\n Enter "+size+" nums : ");
                      for(i=0 ;i<size ; i++)
                           x[ i ] = s.nextInt();      
      
                  System.out.println("\n Enter num : ");
                                 num = s.nextInt();

                             for(i=0 ; i<size ; i++)
                             {
                                           if( num == x[i])
                                           {
                                                 pos = i+1;
                                                     break;
                                            }
                             }

                                      if(pos == 0)                               
                                                  System.out.println("\n num not found ");
                                       else
                                                  System.out.println("\n num found  @ "+pos);
                     	   
           }
    }
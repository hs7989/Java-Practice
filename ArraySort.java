
    public class ArraySort
    {
         public static void main(String [] args)
         {
             java.util.Scanner s = new java.util.Scanner(System.in);
                int i,j,temp,size;

                  System.out.println("\n Enter size : ");
                     size = s.nextInt();
                  
                       int []x = new int [size];

                  System.out.println("\n Enter "+size+" nums : ");
                       for(i=0 ;i<size ; i++)
                          x[i] = s.nextInt();

                     for(i=0 ; i<size ; i++)
                     {
                          for(j=i+1 ; j<size ; j++)
                          {
                              if(x[i] > x[j])
                              {
                                  temp = x[i];
                                  x[i] = x[j];
                                  x[j] = temp;  
                              }
                          }
                     }
                      
                          System.out.println("\n List after sort : ");
                              for(i=0 ; i<size ; i++)
                                 System.out.print(" "+x[i]); 

         }
    }
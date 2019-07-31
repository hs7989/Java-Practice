
    public class Matrix4
    {
         public static void main(String [] args)
         {
             java.util.Scanner s = new java.util.Scanner(System.in);
                  int i,j,k;
                 int [][] A = new int [3][3];

                 System.out.println("\n Enter 9 integers :");
                    for(i=0 ;i<3 ; i++)
                    {
                        for(j=0 ;j<3 ;j++)
                        {
                           A[i][j] = s.nextInt();
                        }
                    }


                 System.out.println("\n Lower Triangle :");
                    for(i=0 ;i<3 ; i++)
                    {
                        for(j=0 ;j<3 ;j++)
                        {
                             if(i<=j)
                                 System.out.print(" "+A[i][j]);
                             else
                                 System.out.print("  ");
                        }
                                 System.out.println("\n");
                    }
                   


         }
    }
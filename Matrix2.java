
    public class Matrix2
    {
         public static void main(String [] args)
         {
             java.util.Scanner s = new java.util.Scanner(System.in);
                  int i,j,k;
                 int [][] A = new int [3][3];
                 int [][] B = new int [3][3];
                 int [][] C = new int [3][3];


                 System.out.println("\n Enter 9 integers :");
                    for(i=0 ;i<3 ; i++)
                    {
                        for(j=0 ;j<3 ;j++)
                        {
                           A[i][j] = s.nextInt();
                        }
                    }

                 System.out.println("\n Enter 9 integers :");
                    for(i=0 ;i<3 ; i++)
                    {
                        for(j=0 ;j<3 ;j++)
                        {
                           B[i][j] = s.nextInt();
                        }
                    }


                    for(i=0 ; i<3; i++)
                    {
                       for(j=0 ; j<3 ;j++)
                       {
                          for(k=0 ;k<3 ; k++)
                          {
                             C[i][j] += A[i][k] * B[k][j]; 
                          }
                       }
                    }

                 System.out.println("\n Matrix after Multiplication :");
                    for(i=0 ;i<3 ; i++)
                    {
                        for(j=0 ;j<3 ;j++)
                        {
                            System.out.print(" "+C[i][j]); 
                        }
                            System.out.print("\n");
                    }

         }
    }
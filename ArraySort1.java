

    class Abc
    {        
        public void sort(int [] y)
        {
            int i,j,temp;
 
            for(i=0 ;i<y.length ; i++)
            {
                for(j=i+1 ; j<y.length ; j++)
                {
                    if(y[i] > y[j])
                    {
                       temp = y[i];
                       y[i] = y[j];
                       y[j] = temp;
                    }
                }
            }
        }   
    }
    public class ArraySort1 
    {
         public static void main(String [] args)
         {
             java.util.Scanner s = new java.util.Scanner(System.in);

              int i , size;

               System.out.println("\n Enter size : ");
                size = s.nextInt();

               int [] x = new int[size];

               System.out.println("\n Enter "+size+" integers : ");
                   for(i=0 ; i<size ; i++)
                       x[i] = s.nextInt();

                  Abc obj = new Abc();
                      obj.sort(x); 

                System.out.println("\n Lis after sort : \n");
                       for(int a : x) 
                           System.out.print(" "+a);   

         }
    }
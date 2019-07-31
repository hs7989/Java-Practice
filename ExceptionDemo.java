
   

    public class ExceptionDemo 
    {
         public static void main(String [] args)
         {
             java.util.Scanner s = new java.util.Scanner(System.in);

                int a=10 , b=0 ,ans=0;
                    int x[]={10,20};

              try
              {
                  ans = x[1] / b;
              }
              catch(ArithmeticException e)
              {                  
                 System.out.println(e);  
              }
              catch(ArrayIndexOutOfBoundsException e)
              {
                 System.out.println(e);  
              }
              catch(Exception e)
              {
                 System.out.println(e);  
              }
                 
             System.out.println("\n ans => "+ans);

         }
    }
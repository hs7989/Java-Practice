
    class Abc 
    {
         public void div(int a , int b)throws Exception
         {
             int ans = a / b;
            
             System.out.println("\n div = "+ans);
         }  
    }  

    public class ExceptionDemo3 
    {
         public static void main(String [] args)
         {
             java.util.Scanner s = new java.util.Scanner(System.in);
  
                   Abc obj = new Abc();

                   try
                   {
                     obj.div(10,2);
                   }
                   catch(Exception e)
                   {
                      System.out.println(e);
                   }
         }
    }
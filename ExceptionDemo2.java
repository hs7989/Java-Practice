
    class MyException extends Exception
    {
         public MyException(String msg)
         {
            super(msg);
         } 
    } 

    public class ExceptionDemo2
    {
         public static void main(String [] args)
         {
             java.util.Scanner s = new java.util.Scanner(System.in);

                int age=0;

               System.out.println("\n Enter ur age : ");
                  age = s.nextInt();  
 
               try
               {
                  if(age < 0)
                  {
                     throw new MyException("Age can not be negative...");
                  }
               }
               catch(Exception e)
	       {
                   System.out.println(e); 
	       }
               finally
               {
                   System.out.println("\n Age => "+age);
               }    

         }
    }
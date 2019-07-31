

    public class ExceptionDemo1
    {
         public static void main(String [] args)
         {
             java.util.Scanner s = new java.util.Scanner(System.in);

             int x=10 , y=0 , ans=0;
               String str=new String("JAVA");

              try
              {
                  char ch = str.charAt(str.length());
              }
              catch(StringIndexOutOfBoundsException e)
              {
                 System.out.println(e);
              }
              catch(Exception e)
              {
                 System.out.println(e);
              }

         }
    }
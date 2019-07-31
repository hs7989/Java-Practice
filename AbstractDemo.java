
   abstract class Abc
   {
      public abstract void add(int x, int y);
   }
 
   class Xyz extends Abc
   {
       public void add(int a , int b)
       {
          System.out.println("\n Add = "+(a+b));
       }       
   } 

    public class AbstractDemo
    {
         public static void main(String [] args)
         {
            // java.util.Scanner s = new java.util.Scanner(System.in);
 
                   Xyz obj= new Xyz();
                    obj.add(11 ,22);                                   

         }
    }



    
    class A
    {
       public void show()
       {
           System.out.println("\n CLASS A ");  
       }
    }

    class B extends A
    {
       public final void show()
       {
           System.out.println("\n CLASS B ");  
       }
    }

    class C extends B
    {
       public void show()
       {
           System.out.println("\n CLASS C ");  
       }
    }

    public class  FinalDemo
    {
         public static void main(String [] args)
         {
             //java.util.Scanner s = new java.util.Scanner(System.in);

         }
    }
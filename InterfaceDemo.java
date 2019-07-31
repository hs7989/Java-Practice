
   interface Addition 
   {
       public abstract void add(int a, int b); 
   }
   interface Multiplication 
   {
       public abstract void mul(int a, int b); 
   }

   class Abc implements Addition , Multiplication
   {
       public void add(int a, int b)
       {
          System.out.println("\n Add = "+(a+b));
       }          
       public void mul(int a, int b)
       {
          System.out.println("\n Mul = "+(a*b));
       }            
   }

    public class InterfaceDemo 
    {
         public static void main(String [] args)
         {
             java.util.Scanner s = new java.util.Scanner(System.in);

                Abc obj = new Abc();

                 Addition a = obj;
                   a.add(10,20);
 
                Multiplication m = obj;
                   m.mul(2,3);           

         }
    }
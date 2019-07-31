

    class A
    {
        public void show()
        {
            System.out.println("\n CLASS A ");
        }
    }
 
    class B extends A
    {
        public void show()
        {
            System.out.println("\n CLASS B ");
        }
    }

    public class OveerideDemo
    {
         public static void main(String [] args)
         {
//             java.util.Scanner s = new java.util.Scanner(System.in);

                B obj = new B();
                  obj.show();
         }
    }

    class A
    {
        public A()
        {
            System.out.println("\n Default Constructor A ");        
        }
        public A(int x, int y)
        {
            System.out.println("\n Constructor A ");
            System.out.println("\n x =  "+x);
            System.out.println("\n y =  "+y);
        }   
        public void show()
        {
           System.out.println("\n CLASS A ");
        }  
    }
    
    class B extends A 
    {
        public B(int a, int b,int c , int d)
        {      
               super(c , d);                                     
            System.out.println("\n Constructor B ");
            System.out.println("\n a =  "+a);
            System.out.println("\n b =  "+b);
        }   
       
        public void disp()
        {
           System.out.println("\n CLASS B ");
        }  
    }

    public class Inher1 
    {
         public static void main(String [] args)
         {
//             java.util.Scanner s = new java.util.Scanner(System.in);

                  B obj = new B(10 , 20 , 30 , 40);

         }
    }
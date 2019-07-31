
    class Abc
    {
       int a, b;

       public Abc()
       {
            a = 10;
	    b = 20;
       }
 
        public Abc(int x , int y)
        {
            a = x;
            b = y; 
        } 

        public Abc(Abc temp)
        {
            a = temp.a;
            b = temp.b;
        }
 
        public void show()
        {
           System.out.println("\n a = "+a);
           System.out.println("\n b = "+b);
        }   
       
    } 

    public class Cons1
    {
         public static void main(String [] args)
         {
             java.util.Scanner s = new java.util.Scanner(System.in);
 
                Abc obj = new Abc();
                    obj.show(); 

                Abc obj2 = new Abc(100 , 200);
                    obj2.show();   
            
                Abc obj3 = new Abc(obj2);
                    obj3.show();

                Abc obj4 = obj3;
                    obj4.show();

         }
    }
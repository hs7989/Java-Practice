
    interface Area
    {
       public abstract void compute(float x);
    }

    class Circle implements Area
    {
        public void compute(float r)
        {
           float area = (float) (Math.PI * Math.pow(r , 2));
             System.out.println("\n\n Area of circle => "+area);
        }
    }

    class Square implements Area
    {
        public void compute(float r)
        {
           float area = (float) Math.pow(r , 2);
             System.out.println("\n\n Area of square => "+area);
        }
    }

    public class InterfaceDemo2 
    {
         public static void main(String [] args)
         {
         //    java.util.Scanner s = new java.util.Scanner(System.in);

                Circle c = new Circle();
                Square s = new Square(); 

                     Area a = c;
                     a.compute(1);
                    
                     a = s;
                     a.compute(2); 

         }
    }
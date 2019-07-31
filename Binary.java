


    public class Binary
    {
         public static void main(String [] args)
         {
             int num , rem , bin=0 ,i=0;
             java.util.Scanner s = new java.util.Scanner(System.in);

             System.out.println("\n Enter any num : ");
                 num = s.nextInt();

               while(num > 0)
               {
                  rem = num % 2;
            
                  bin = bin + (int)(Math.pow(10 , i) * rem);
     
                  num /= 2;
                    
                   i++;
               }    
 
                System.out.println("\n Binary => "+bin);
   


         }
    }
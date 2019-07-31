
    class Employee
    {
         String ename;
         int eid;

       public void getDetails()
       {  
           java.util.Scanner s = new java.util.Scanner(System.in);
  
           System.out.println("\n Enter Employee Name : ");
               ename = s.nextLine();

           System.out.println("\n Enter Employee Id : ");
              eid = s.nextInt();      
       }
     
       public void printDetails()
       {
          System.out.println("\n Eid = "+eid);
          System.out.println("\n EName = "+ename);
       } 
    }     
    
    public class Class5
    {
         public static void main(String [] args)
         {
             Employee e1 = new Employee();
                   e1.getDetails(); 
                   e1.printDetails(); 
 
            Employee e2 = new Employee();
                   e2.getDetails(); 
                   e2.printDetails(); 

         }
    }
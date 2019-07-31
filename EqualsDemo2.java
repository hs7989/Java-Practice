
    class Employee
    {
       String ename;
        int eid;

       public Employee()
       {

       }

       public Employee(String ename , int eid)
       {
          this.ename = ename;
          this.eid = eid;
       }
 
       public boolean equals(Object o)
       {
            if(o instanceof Employee)
            {
                Employee obj = (Employee)o ;

                 if(obj.eid == eid)
                 {
                     return true;
                 }
                 else 
                 {
                     return false;
                 }
            }
            else
            {
                    return false;
            }
       }
    }

    public class EqualsDemo2
    {
         public static void main(String [] args)
         {
             java.util.Scanner s = new java.util.Scanner(System.in);

                 Employee e1 = new Employee("ABC" , 111);
                 Employee e2 = new Employee("ABC" , 111);

                 if(e1.equals(e2))
                 {
                    System.out.println("EQUAL");
                 }
                 else
                 {
                    System.out.println(" NOT EQUAL");
                 }

         }
    }
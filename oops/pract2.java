class Employee{
        String name;
        int emp_no;
        String dpt;
        Employee(){
            System.out.println("default constructor is called...");
            this.name = "xyz";
            this.emp_no = 123;
            this.dpt = "Ctech";
        } 
        Employee(String n , int a , String d){
            System.out.println("parameterized constructor is called...");
            this.name = n;
            this.emp_no = a;
            this.dpt = d;
        }
        void display(Employee e){
            System.out.println(this.name);
            System.out.println(this.emp_no);
            System.out.println(this.dpt + "\n");
        }
        
    }

public class pract2 {
    
    public static void main(String args[]){

        

        Employee e1 = new Employee();
        e1.display(e1);
        Employee e2 = new Employee("Vedant" , 22071155 , "C.technology");
        e2.display(e2);

    }
}

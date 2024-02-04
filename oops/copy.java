
public class copy {
    

    public static void main(String args[]){
        Student s1 = new Student(154);
        s1.name = "snehu";
        s1.marks[0] = 98;
        s1.marks[1] = 100;
        //s1.name = "adi";


        System.out.println(s1.marks[0]);
        System.out.println(s1.marks[1]);
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        s1.marks[0] = 50;
        s1.marks[1] = 48;
        System.out.println(s1.name);
        System.out.println(s2.name);
        
        System.out.println(s2.marks[0]);
        System.out.println(s2.marks[1]);
        
    }
}


class Student{
    String name;
    int regno;
    int marks[];

    
    
    Student(Student s1){
        marks = new int[2];
        this.name = s1.name;
        this.regno = s1.regno;
        this.marks = s1.marks;
        
    }
    Student(int r){
        marks = new int[2];
        this.regno = r;
    }
    
    }
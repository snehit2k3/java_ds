

public class access_modifier {
    public static void main(String args[]){
        bank b1 = new bank();

        b1.setName("snehit");
        b1.setNo(55);
        b1.display();
 //       System.out.println(b1.addno);
    }
}

class bank{
    String accountHolder;
    private int addno;

    void setName(String name){
        accountHolder = name;
    }
    void setNo(int no ){
        addno = no;
    }
    void display(){
        System.out.println(accountHolder);
        System.out.println(addno);
    }
}

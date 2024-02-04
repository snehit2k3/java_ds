

public class getset {
    public static void main(String args[]){
        pen p1 = new pen();
        p1.setColor("red");

        System.out.println(p1.getColor());
    }
}
class pen{
    int tip;
    String color;

    void setColor(String col){
        this.color = col;
    }
    String getColor(){
        return this.color;
    }
}
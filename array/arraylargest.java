package array;
public class arraylargest {
    public static int largest(int marks[]){
        int a = Integer.MIN_VALUE ;
        for(int i = 0; i < marks.length; i++){
            if(a<marks[i]){
                a = marks[i];
            }
        }
        return a;
    }
    public static void main(String args[]){
        int marks[] = {1,2,3,4,69,6};
        int c = largest(marks);
        System.out.println("largest is " + c);
    }
}
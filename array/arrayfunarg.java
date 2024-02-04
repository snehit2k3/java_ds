package array;
public class arrayfunarg {
    public static void update(int mark[]){
            for(int i = 0 ; i < mark.length ; i++){
                mark[i] += 2;
            }
        
    }
    public static void main(String args[]){
        int marks[] = {1,2,3,4,5,6,7,8};
        update(marks);
        System.out.println(marks[0] + " "+ marks[1] +" "+ marks[2]);
    }
}

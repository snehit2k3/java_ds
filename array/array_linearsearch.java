package array;
public class array_linearsearch {
    public static int linear_search(int marks[] ,int key){
        for(int i = 0; i < marks.length; i++){
            if(marks[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int marks[]= {1,2,3,4,5,6,7,8};
        int app = 6;
        int c =  linear_search(marks,app);
        System.out.println(c + " is the index of " + app);
    }
}
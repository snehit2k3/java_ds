package array;
import java.util.*;
public class subarray {
    public static void subarr(int array[]){
        for(int i = 0 ; i< array.length ; i++ ){
            int start = i;
            for(int j = i;j < array.length ; j++){
                int end = j;
                for(int k = start ; k <= end ; k++){
                    System.out.print(array[k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
            int array[] = new int[4];
            Scanner s = new Scanner(System.in);
            for(int i = 0; i< 4 ; i++){
                array[i] = s.nextInt();

            }
            subarr(array);
            s.close();
    }
}

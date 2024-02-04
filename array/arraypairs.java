package array;
import java.util.*;

public class arraypairs {
    public static void pairs(int array[]){
        for(int i  = 0; i < array.length ; i++){
            int current = array[i];
            for(int j = i;j < array.length; j++){
                System.out.println(current + " , "+ array[j]);
               
            } 
        }
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5 ; i++){
            arr[i] = sc.nextInt();
        }
        pairs(arr);
        sc.close();
    }
}

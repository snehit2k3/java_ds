package array.two_d;
//also includes searching program
import java.util.*;
public class twod_array {
    public static void main(String args[]){
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
        search(arr,3);
    }
    public static void search(int arr[][] , int key){
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j] == key){
                    System.out.println("the index of "+ (key) + " is "+(i+1)+"," + (j+1));
                }
            }
        }
    }
}

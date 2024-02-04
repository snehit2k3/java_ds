package array;
import java.util.*;
public class arrayrev{
public static void reverse(int arr[]){
    int start = 0;
    int end = arr.length-1;
    while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start = start + 1;
        end = end - 1;
        }
    }
public static void main(String args[]){
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < 5;i++){
        arr[i] = sc.nextInt();
    }
    reverse(arr);
    for(int i = 0; i < 5 ;i++){
        System.out.print(arr[i] + "  ");
    }
    sc.close();
}
}

package array;

import java.util.*;
public class array_binarysearch {
    public static int binaryser(int marks[], int key){
        int front = 0,mid;
        int end = marks.length - 1;
        while(front <= end){
            mid = (front + end)/2;
            if(marks[mid] == key){
                return mid+1;
            }
            if(marks[mid] > key){
                end = mid - 1;
                
            }
            else if(marks[mid]<key){
                front = mid + 1;
              
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5 ; i++){
            
            marks[i] = sc.nextInt();
            //sc.close();
        }
        System.out.println("index " + binaryser(marks,30));
        sc.close();
    }
}

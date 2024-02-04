package recursion;

import java.net.StandardSocketOptions;

public class quicksort {
    public static void sort(int arr[] , int si , int ei){
        if(si >= ei){
            return;
        }
        int pidx = partition(arr , si , ei);
        sort(arr , si , pidx-1);
        sort(arr , pidx+1 , ei);
    }

    public static int partition(int arr[] , int si , int ei){
        int i = si-1;
        int pivot = arr[ei];
        int temp ;
        for(int j = si ; j < ei ; j++){
            if(arr[j] <= pivot){
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]){
        int arr[] = {1,25,38,7,65,9,2,5};
        sort(arr , 0 , arr.length-1);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

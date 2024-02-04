package array;
public class arraysortassignmentsame {
    public static int[] bubble(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n - 1; i++){
            for(int j = 0 ; j < n - 1 - i; j++){
                if(arr[j+1] > arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selection(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int mpos = i;
            for(int j = i+1 ; j < n  ; j++){
                if(arr[mpos] < arr[j]){
                    mpos = j;
                }
            }
            int temp = arr[mpos];
            arr[mpos] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }


    public static void print(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,1,3};
        //int arr1[] = bubble(arr);
        int arr1[] = selection(arr);
        print(arr1);
    }
}

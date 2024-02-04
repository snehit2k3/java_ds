package array;
public class array2 {
    public static int tindex(int arr[] , int t){
        int count = 0, index2 = 0;
        for(int i = 0 ; i < arr.length ; i++){
            // int index = -1 ,  smallest = Integer.MAX_VALUE;
            // if(arr[i] < smallest){
            //     smallest = arr[i];
            //     index = i;
            // }
            if(arr[i] == t){
                count = 1;
                index2 = i;
            }
        }
        if(count == 0){
            return -1;
        }
        return index2;
        
    }
    public static void main(String args[]){
        int arr1[] = {4,5,6,7,0,1,2};
        int arr2[] = {4,5};
        System.out.println(tindex(arr1,0));
        System.out.println(tindex(arr2,0));

    }
}
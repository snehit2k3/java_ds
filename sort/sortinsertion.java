package sort;
public class sortinsertion {
    public static void  insertion(int arr[]){
        for(int i = 1 ; i < arr.length ; i++){
            int prev = i-1 , curr = arr[i];
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        insertion(arr);
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
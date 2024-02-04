package array;
public class array3 {
    public static int stocks(int arr[]){
        int buy = Integer.MAX_VALUE , max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(buy < arr[i]){
                int profit = arr[i] - buy ;
                max = Math.max(profit,max);
            }
            else{
                buy = arr[i];
            }
        }
        if(max > 0)
            return max;
        return 0;
    }
    public static void main(String args[]){
        int arr[] = {7, 1 , 5 , 3 , 6 ,4};
        int arr2[] = {7,6,4,3,2,1};
        System.out.println(stocks(arr));
        System.out.println(stocks(arr2));
    }
}
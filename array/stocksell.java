package array;
public class stocksell {
    public static int stock(int arr[]){
        int max = Integer.MIN_VALUE;
        int profit= 0,a ;
        for(int i = 0; i<arr.length ; i++){
            a = i;
            for(int j = i+1 ; j < arr.length ; j++){
                profit = arr[j] - arr[a]; 
                max = (profit > max ? profit : max);
            }
            
        }
        if(max > 0){
            return max;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {7, 1 , 5 , 3 , 6 , 4};
        System.out.println(stock(arr));
    }
}

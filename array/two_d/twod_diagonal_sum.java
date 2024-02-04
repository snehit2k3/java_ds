package array.two_d;
public class twod_diagonal_sum {
    public static int digonal (int arr[][]){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i][i];

            if(i != arr.length - i - 1){
                sum += arr[i][arr.length - i -1];
            }
        }
        return sum;
    }    
    public static void main(String args[]){
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(digonal(array));
    }
}

//here middle element not includded double as we have included condition of i != j )) ie i != n - i - 1; OK 

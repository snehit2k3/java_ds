package array;
public class trappedrain {
    public static int rain(int arr[]){
        int l = arr.length;
        int trapped = 0;
        int leftmax[] = new int[arr.length];
        int rightmax[] = new int[arr.length];
        leftmax[0] = arr[0];
        for(int i = 1; i < l ; i++ ){
            // if(arr[i] > leftmax[i-1] ){
            //     leftmax[i] = arr[i];
            // }
            // else{
            //     leftmax[i] = leftmax[i-1];
            // }
            leftmax[i] = Math.max(arr[i] , leftmax[i-1]);

        }
        rightmax[l-1] = arr[l-1];
        for(int j = l-2; j >= 0 ; j--){
            rightmax[j] = Math.max(arr[j] , rightmax[j+1]);
        }
        for(int i = 0 ; i<l ; i++){
            int water =( Math.min(leftmax[i], rightmax[i]) - arr[i]);
            trapped += water;
        }
        return trapped;
    }

    public static void main(String args[]){
        int array[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(rain(array));
    }
}

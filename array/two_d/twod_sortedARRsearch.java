package array.two_d;
//top right is considered as a refrence point 

public class twod_sortedARRsearch {
    public static boolean search(int arr[][] , int key){
        int col = arr[0].length - 1;
        int row = 0;
        while(row < arr.length && col >= 0){
            if(key == arr[row][col]){
                System.out.println("("+row+" , "+col+")");
                return true;
            }
            else if(key < arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        search(arr, 6);
        
    }
}

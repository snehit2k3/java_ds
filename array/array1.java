package array;
public class array1 {
    public static boolean same(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            int a = arr[i];
            for(int j = i+1; j < arr.length ; j++){
                if(a == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        //boolean dec;
        int array[] = {1,2,3,4, 5, 5,4,3,3,5,6}; 
        System.out.println(same(array));
    }
}

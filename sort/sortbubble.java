package sort;
public class sortbubble {
    public static int[] bubble(int array[]){
        for(int turns = 0 ; turns < array.length - 1;turns++){
            for(int i = 0 ; i < array.length - 1 - turns ; i++){
                    if(array[i] > array[i+1]){ 
                        int temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                    }
            }
        }
        return array;
    }
    public static void main(String args[]){
        int arr[] = {1,5,2,7,3};
        int sorted[] = bubble(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(sorted[i]+" ");
        }
    }
}

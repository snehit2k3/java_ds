package sort;
public class sortselection {
    public static int [] selection(int arr[]){
        for(int i = 0 ;i < arr.length-1 ; i++ ){
            int minpos = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i] ; 
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String args[]){
        int array[] = {3,9,7,5,6,2,1};
        int sort[] = selection(array);
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(sort[i] + " ");
        }
    }
}
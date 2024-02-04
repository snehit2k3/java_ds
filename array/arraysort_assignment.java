package array;
public class arraysort_assignment {
    public static void bubble_sort(int array[]){
        for(int i = 0 ; i<=array.length-2 ; i++){
            for(int j = 0; j<=array.length - 2 - i; j++){
                if(array[j+1] < array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void selection(int array[]){
        for(int i = 0 ; i < array.length - 1; i++){
            int minpos = i;
            for(int j = i+1 ; j < array.length ; j++){
                if(array[minpos] > array[j]){
                    minpos = j;
                }
            }
            int temp = array[i];
            array[i] = array[minpos];
            array[minpos] = temp;
        }
    }

    public static void insertion(int array[]){
        for(int i = 1 ; i < array.length ; i++){
            int prev = i - 1 , curr = array[i];
            while(array[prev] > curr && prev >= 0){
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev+1] = curr;
        }
    }
    public static void count(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int count[] = new int[max+1];
        for(int i = 0; i < arr.length ; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = arr.length - 2 ; i >= 0 ; i--){
            while(count[i] > 0){
                arr[j]  = i ;
                count[i]--;
                j++;
            }
        }
    }

    public static void print(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,6,8,2,3,6,7,4,5,5};
        //bubble_sort(arr);
        //selection(arr);
        //insertion(arr);
        count(arr);
        print(arr);
    }
}


package array;
//for user defined input, we have to use import util and here we fhave to use same two loops that we used earlier but just one loop from start to end is replaced and rest two loops are constant. 
//this program returns us the value from a to b ;
public class maxsumsubarray2 {
    public static int sumarray(int array[] , int start , int end){
        int prefix[] = new int[array.length];
        
        prefix[0] = array[0];
        for(int i = 1 ; i < array.length ; i++){
            prefix[i] = prefix[i - 1] + array[i];
        }
        for(int i = 0 ; i<array.length ; i++){
            System.out.print(prefix[i] + " ");
        }
        int a = prefix[end] - (start == 0 ? 0 :  prefix[start - 1]);
        return a;
    }

    public static void main(String args[]){
        int arr[] = { 1 , 2 , 3 , 4 , 5};
        int a = 0;
        int b = 3;
        System.out.println(sumarray(arr, a, b) ); 
    }
}

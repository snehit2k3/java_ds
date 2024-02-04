package array;
public class maxsumsubarray1 {
    public static int maxsum(int array[]){
        int a = Integer.MIN_VALUE ;
        int current;
        for(int i = 0; i < array.length ; i++){
            int start = i;
            for(int j = i ; j < array.length ; j++){
                int end = j;
                current = 0;
                for(int k = start ; k <=end ; k++){
                    current += array[k];
                    
                }
                System.out.println(current);
                if(current > a){
                    a = current;
                }
            }
            
        } 
        return a;
    }

    public static void main(String args[]){
        int arr[] = {1, -2, 6 , -1, 3} ;
        System.out.println("max is "+maxsum(arr));
    } 
}

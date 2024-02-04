package array;
public class maxsumsubarray3 {
    public static int kadane(int number[]){
        int cs = 0;
        int  mx = Integer.MIN_VALUE;
        for(int i = 0; i < number.length ; i++){
            cs += number[i];
            cs = (cs >= 0 ? cs  : 0);
            mx = (cs > mx ? cs : mx);
        }
        
        
        return mx;
    }
    public static void main(String args[]){
        int arr[] = {-2, -3, 4, -1, -2, 1, 5 , -3};
        System.out.println(kadane(arr));
    }
}

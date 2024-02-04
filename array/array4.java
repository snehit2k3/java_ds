package array;
public class array4 {
    public static int trapped(int rain[]){
        
        int trap = 0;
        int leftmax[] = new int[rain.length];
        int rightmax[] = new int[rain.length]; 
        leftmax[0] = rain[0];
        
        for(int i = 1; i < rain.length ; i++){
            leftmax[i] = Math.max(leftmax[i - 1] , rain[i]);
        }
       
        rightmax[rain.length - 1] = rain[rain.length - 1];
        
        for(int i = rain.length - 2; i >= 0; i--){
            rightmax[i] = Math.max( rightmax[i+1], rain[i]);
        }
    
        for(int i = 0 ; i < rain.length ; i++){
            int water = Math.min(leftmax[i],rightmax[i]) - rain[i] ;
            trap += water;
        }
        return trap;
    }

    public static void main(String args[]){
        int arr1[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int arr3[] = {4,2,0,3,2,5};
        System.out.println(trapped(arr1));
        System.out.println(trapped(arr3));
    }
}

package array.two_d;
public class twodarray_assignment {
    public static int sevens(int arr[][] , int key){
        int count = 0;
        int row = arr.length;
        int col = arr[0].length;
        for(int  i = 0 ; i < row ; i++ ){
            for(int j = 0 ; j < col ; j++){
                if(arr[i][j] == key)
                count++;
            }
        }
        return count;
    }
    public static int sum(int arr[][] , int r){
        //int row = arr.length;
        int col = arr[0].length;
        int s = 0;
        for(int i = 0 ; i < col ; i++){
            s += arr[r - 1][i];
        }
        return s;
    }

    public static int [][] transpose(int arr[][]){
        int row = arr.length ;
        int col = arr[0].length ;
        int trans[][] = new int[col][row];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                trans[j][i] = arr[i][j];
            }
        }
        return trans;
    }


    public static void print(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0 ; i < row ; i ++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[][] = {{11,12,13} , {21,22,23}};
        //System.out.println(sevens(arr , 8));
        //System.out.println(sum(arr, 2));
        
        print(transpose(arr));
    }
}

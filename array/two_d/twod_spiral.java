package array.two_d;
//to be continued 01:20 am
//import java.util.*;
public class twod_spiral {
    public static void spiral(int arr[][]){
        int srow = 0;
        int erow = arr.length - 1;
        int scol = 0;
        int ecol = arr[0].length -1;
        // int m = arr[0].length;
        // int n = arr.length;
        while(srow<=erow && scol<= ecol){
        //top
        for(int i = scol ; i <= ecol ; i++){
            System.out.print(arr[srow][i]+" ");
        }
        //right
        for(int i = srow+1 ; i <= erow ;i++){
            System.out.print(arr[i][ecol] + " ");
        }
        //bottom
        for(int i = ecol - 1 ; i >= scol ;i--){
           if(scol == ecol){
                break;
            }
            System.out.print(arr[erow][i]+" ");
        }
        //left
        for(int i = erow - 1 ; i> srow ; i--){
            if(scol == ecol){
                break;
            }
            System.out.print(arr[i][scol]+ " ");
        }
        scol++;
        srow++;
        ecol--;
        erow--;
    }
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3,13,17},{4,5,6,14,18},{7,8,9,15,19},{10,11,12,16,20}};
        spiral(arr);
        System.out.println("\ndone with the code guys!");
    }
}

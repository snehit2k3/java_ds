package sort;

public class merge {
    public static void mergesort(int[] arr, int si , int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        mergesort(arr, si , mid);
        mergesort(arr, mid+1 , ei);
        merges(arr , si , mid , ei);
    }
    public static void merges(int[] arr, int si, int mid, int ei){
        int[] temp = new int [ei - si + 1];
        int i = si , j = mid+1;
        int t = 0;
        while(i <= mid && j <= ei){
            if(arr[i] > arr[j]){
                temp[t] = arr[j];
                j++;

            }else{
                temp[t] = arr[i];
                i++;
            }
            t++;
        }
        while(i <= mid){
            temp[t] = arr[i];
            i++;
            t++;
        }
        while(j <= ei){
            temp[t] = arr[j];
            j++;
            t++;
        }
        for(int m = 0 ,  n = si ; m < temp.length ; m++,n++){
            arr[n] = temp[m];
        }

    }


    public static void main(String[] args){
        int[] arr = { 30,28,15,69};
        mergesort(arr , 0 , arr.length - 1);

        for (int j = 0; j < arr.length ; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

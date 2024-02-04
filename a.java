//codechef problem question are here and ae are here to use the following 
/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
public class a
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    t--;
		    int N = sc.nextInt();
		    int arr[] = new int[N];
		    
		    for(int i=0; i<N ;i++){
		        arr[i] = sc.nextInt();
		        
		        if(i%2 == 0){
		            if(arr[i] == 0 && arr[i+1] == 1){
		           System.out.print("T");
		        }
		        else if(arr[i] == 1 && arr[i+1] == 1){
		           System.out.print("G");
		        }
		        else if(arr[i] == 1 && arr[i+1] == 0){
		           System.out.print("C");
		        }
		        else if(arr[i] == 0 && arr[i+1] == 0){
		           System.out.print("A");
		        }
		        System.out.println();
		        }
		    }
		    
		}
		
		
		
		sc.close();
	}
}

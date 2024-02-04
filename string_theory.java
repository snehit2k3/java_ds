
import java.util.*;
public class string_theory {
    public static void  concatinate(String a1 , String a2){
        String cctn = a1 + " " + a2;
        System.out.println(cctn);
    }

    public static void input(){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println(x + " ans ");
        sc.close();
    }

    public static Boolean palindrone(String pal){
        int l = pal.length();
        for(int i = 0 ; i < l/2 ; i++){
            if(pal.charAt(i) != pal.charAt(l - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        //this is work 
            //actual program is here 


        //concatination manually using function 
            //String a = "snehit" , b = "telrandhe";
            //concatinate(a,b);

        //handmade input function
            //input();
        

        //Stringname.charAt(index);
            //System.out.println(a.charAt(0));

        //palindrone
            //String pal = "tihenssnehit" ; 
            //System.out.println(palindrone(pal));

    }
}

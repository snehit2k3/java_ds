





import java.util.*;
public class string_assignment {
    public static int lowercase(String str){
        int l = str.length();
        int count = 0;
        for(int i = 0 ; i < l ; i ++){
           char a =  str.charAt(i);
           if(a>=65 && a <= 90){
            count++;
           }
        }
        return count;
    }

    public static void anagrams(String str1, String str2){
        if(str1.length() == str2.length()){
            char str1arr[] = str1.toCharArray();
            char str2arr[] = str2.toCharArray();
            Arrays.sort(str1arr);
            Arrays.sort(str2arr);
            if(Arrays.equals(str1arr,str2arr)){
                System.out.println("anagrams yes");
            }
            else{
                System.out.println("not");
            }
        } else{
            System.out.println("not");
        }        
    } 
    public static void main(String args[]){
        String a = "race";
        String b = "care";
        anagrams(a,b);
    }
}
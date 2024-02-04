package recursion;

public class printing {
    public static void main(String args[]){
        NToOne i = new NToOne();
        i.printdec(10);
        i.printinc(10);
        System.out.println("\nfibonacci :-) " +i.fib(11));
        System.out.println("Factorial "+ i.factorial(5));
        System.out.println("SUM : " + i.sum(10));
    }
    }

class NToOne{
    void printdec(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.print(n +" ");
        printdec(n-1);
    }
    void printinc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printinc(n-1);
        System.out.print(n + " ");

    }
    int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int a = fib(n-1);
        int b = fib(n-2);
        return a+b;
    }
    int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n*factorial(n-1); 
        
    
    }
    int sum(int n){
        if(n == 1){
            return n;
        }
        return n+sum(n-1);
    }
}

import java.util.Scanner;

public class Fibonacci {

    static int fib(int n){
        if(n==1){
            return 0;
        } else if(n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }    

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = sc.nextInt();
        for(int i=0; i<x; i++){
            System.out.println(fib(i));
        }
    }
}
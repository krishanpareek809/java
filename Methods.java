import java.util.Scanner;

public class Methods {

    /*
    static int fun(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(fun(2,3));
    }
    */
    

    // VarArgs ( Varibale Arguments )

    /*
    static int sum(int x, int ...arr){
        int result = x;
        for (int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,3,5,6));
    }
    */


    // Program 1
    /*
    static void Mul(int n){
        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", n,i,n*i);
        }
    }

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to print the table: ");
        x = sc.nextInt();
        Mul(x);
    }
    */


    // Program 2
    /*
    static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        pattern(x); 
    }
    */


    // Program 3
    /*
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumRec(3));
    }
    */


    // Program 4
    /*

    static void pattern(int n){
        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        pattern(x); 
    }
    */


    // Program 5
    /*
    static int Fibonacci(int n){
        if(n==1){
            return 0;
        } else if(n==2){
            return 1;
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }
    */

    // Program 6
    /*
    static float average(int... n){
        int a = n.length;
        float sum = 0;
        for(int i: n){
            sum += i;
        }
        return sum/a;

    }

    public static void main(String[] args) {
        System.out.println(average(1,2,3,4));
    }
    */


    // Program 7
    /*
    static void pattern_Rec(int n){
        if(n>0){
            pattern_Rec(n-1);
            for(int i=1; i<=n; i++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // pattern_Rec(4) => call for 4
    // pattern_Rec(3) + 4 stars and new line
    // pattern_Rec(2) + 3 stars and new line + 4 stars and new line
    // pattern_Rec(1) + 2 stars and new line + 3 stars and new line + 4 stars and new line
    // pattern_Rec(0) + 1 star and new line + 2 stars and new line + 3 stars and new line + 4 stars and new line

    public static void main(String[] args) {
        pattern_Rec(4);
    }
    */


    // Program 8
    static void pattern_Rec2(int n){
        if(n>0){
            for(int i=1; i<=n; i++){
                System.out.print("*");
            }
            System.out.println();
            pattern_Rec2(n-1);
        }
    } 

    public static void main(String[] args) {
        pattern_Rec2(4);
    }
}
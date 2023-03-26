import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // break is used to exit the loop whether the condition is true or false, whenever a "break" is encountered inside the loop, the control is sent outside the loop
        // continue is used to immediately move to the next iteration of the loop, thus, skipping everything below "continue" inside the loop for that iteration
     
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        // // sum of n odd/even numbers
        // int sum = 0;
        // for(int i=0;i<n;i++){
        //     sum = sum + (2*i);  // for odd numbers -> sum = sum + (2*i+1)
        // }
        // System.out.println("Sum of n even numbers is: "+sum);


        // // using while loop
        // int i = 0;
        // int sum = 0;
        // while(i<n){
        //     sum = sum + (2*i);
        //     i++;
        // }
        // System.out.println("Sum of n even numbers is: "+sum);


        // multiplication table of a given number n
        // int i;
        // for (i=10;i>=1;i--){
        //     System.out.printf("%d X %d = %d\n",n,i,n*i);
        // }


        // factorial of a number using for loop
        // int fact = 1;
        // for(int i=1;i<=n;i++){
        //     fact = fact*i;
        // }
        // System.out.println(fact);


        // factorial of a number using while loop
        // int fact = 1;
        // int i = 1;
        // while(i<=n){
        //     fact = fact*i;
        //     i++;
        // }
        // System.out.println(fact);


        // int i = 1, j = 1, n = 5;
        // while(i<=n){
        //     while(j<=i){
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        //     j = 1;       // WHY???????
        // }


        // int i = 1, n=8, sum=0;
        // for(i=1;i<=10;i++){
        //     // sum = sum + (n*i);
        //     sum += n*i;
        // }
        // System.out.printf("Sum of numbers occuring in the table of 8 is: " + sum);


        // int i = 1;
        // int sum = 0;
        // while(i<=n){
        //     sum = sum + (2*i);
        //     i++;
        // }
        // System.out.println("Sum of first n even numbers is: " + sum);
    }
}
import java.util.Random;
import java.util.Scanner;

public class Conditionals {
     public static void main(String[] args) {
        /*
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = sc.nextInt();

        switch(age){
            case 18: 
                System.out.println("You are an adult"); 
                break;
            case 25:
                System.out.println("Prepare for your job");
                break;
            case 60:
                System.out.println("You are bujurg");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }
        */

        /*
        if(age>56){
            System.out.println("You are experienced");
        } else if(age>36){
            System.out.println("You are semi-semi-experienced");
        } else if(age>46){
            System.out.println("You are semi-experienced");
        } else{
            System.out.println("You are not experienced");
        }
        */


        // Practice Set 4
        /*
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks for first subject:");
        m1 = sc.nextByte();

        System.out.println("Enter your marks for second subject:");
        m2 = sc.nextByte();

        System.out.println("Enter your marks for third subject:");
        m3 = sc.nextByte();

        float totalMarks = ((m1+m2+m3)/300.0f)*100.0f;
        System.out.println("Your percentage is: " + totalMarks);

        if(totalMarks>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("You are pass");
        } else {
            System.out.println("You are fail");
        }
        */

        /* Different formula from CWH video
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        float income;
        System.out.println("Enter your income");
        income = sc.nextFloat();
        
        if(income<2.5){
            tax = 0.0f;
        } else if(2.5<=income && income<5){
            tax = income/20.0f;
        } else if(5<=income && income<10){
            tax = income/5.0f;
        } else if(income>=10){
            tax = income/3.33f;
        }
        System.out.println("Tax paid is Rs."+tax);
        */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year to check for leap year: ");
        int year = sc.nextInt();

        if(year%100==0 && year%400==0){
            System.out.println(year + " is a leap year");
        } else if(year%4==0 && year%100!=0){
            System.out.println(year + " is a leap year");
        } else{
            System.out.println(year + " is not a leap year");
        }
        */
        
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website");
        String website = sc.next();

        if(website.contains(".com")){
            System.out.println("This is commercial website");
        } else if(website.contains(".org")){
            System.out.println("This is organisational website");
        } else if(website.contains(".in")){
            System.out.println("This is Indian website");
        }
        */
    }
}
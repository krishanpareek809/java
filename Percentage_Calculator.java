import java.util.*;
class Percentage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all subject marks: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        // double d = sc.nextDouble();
        // int e = sc.nextInt();
        
        double cgpa = (a + b + c)/300*100/9.5;

        System.out.println(cgpa + " cgpa");

    }
}
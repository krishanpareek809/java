import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("Press 1 for Rock");
        System.out.println("Press 2 for Paper");
        System.out.println("Press 3 for Scissor\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("The number chosen by Player is: ");
        int p = sc.nextInt();

        Random ra = new Random();
        int c = ra.nextInt(1,4);
        System.out.println("The number chosen by Computer is: " + c + "\n");

        if(p==1 && c==1 || p==2 && c==2 || p==3 && c==3){
            System.out.println("Match is Draw!");
        } else if(p==1 && c==3 || p==2 && c==1 || p==3 && c==2){
            System.out.println("Player wins!");
        } else if(p==1 && c==2 || p==2 && c==3 || p==3 && c==1){
            System.out.println("Computer wins!");
        } else{
            System.out.println("The number chosen is invalid!");
        }
    }
    
}

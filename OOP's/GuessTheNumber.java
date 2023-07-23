import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;
    
    Game(){
        Random ra = new Random();
        this.number = ra.nextInt(100);
    }

    void takeUserInput(){
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    } 

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts\n", number, noOfGuesses);
        } else if(inputNumber<number){
            System.out.println("Lower");
        } else if(inputNumber>number){
            System.out.println("Higher");
        } 
        return false;
    }

    void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    int getNoOfGuesses(){
        return noOfGuesses;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();

        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}

import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int minRange=1;
        int maxRange=100;
        int maxAttempts=10;
        int score=0;
        System.out.println("Welcome to number guessing game");
        boolean playAgain=true;
        while(playAgain){
            int target=random.nextInt(maxRange-minRange+1)+minRange;
            int attempts=0;
            boolean guessedcorrectly=false;
        
            System.out.println("I have selected a number between"+ minRange +"and" + maxRange +"Try to guess it.");
            while(attempts<maxAttempts){
                System.out.println("Enter your guess");
                int userGuess=sc.nextInt();
                attempts++;
        
                if(userGuess==target){
                    System.out.println("Congratulations!You have guessed the correct number in"+attempts+"attempts");
                    score++;
                    break;
                }else if(userGuess<target){
                    System.out.println("Too low.Try again");
                }
                else{
                    System.out.println("Too high!Try again");
                }
                if(attempts==maxAttempts){
                    System.out.println("Sorry,you have run out of attempts.The correct number was"+target+".");
                }
            }    
            System.out.println("Do you want to play again?(yes/no)");
            String playAgaininput=sc.next();
            if(!playAgaininput.equalsIgnoreCase("yes")){
                playAgain=false;
            }
        }    
        System.out.println("Thanks for playing!.Your final score is"+score);
        sc.close();
    }
}
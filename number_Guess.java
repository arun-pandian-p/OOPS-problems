import java.util.Random;
import java.util.Scanner;
class number_Guess{
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        //Generate random number 1-100
        int target=rand.nextInt(10)+1;
        int guesscount=0;
        int playerguess=0;
        //----------------end generated number----------------------
        System.out.println("--- Welcome to the Number Guessing Game! ---");
        System.out.println("I am thinking of a number between 1 and 100.");
        while(playerguess !=target)
        {
            System.out.println("Enter your guess: ");
            playerguess =sc.nextInt();
            guesscount++;
            
            //Suggestion or feedback
            if(playerguess>target)
            {
                System.out.println("The number is too high:");
            }
            else if(playerguess<target)
            {
                System.out.print("The number is too low:");
            }
            else{
                System.out.print("\n🎉 Congratulations! You guessed the right number!"+guesscount);
            }
        }


    }
}
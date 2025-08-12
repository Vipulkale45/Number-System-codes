package JAP82.NumberSystem;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random = new Random();

        int userGuessNumber = 0;
        int attempt =0;

        int randomNumGenerate = random.nextInt(50)+1;
        System.out.println("Guess the number " + randomNumGenerate);

        while(randomNumGenerate!= userGuessNumber)
        {
            System.out.println("Enter the guess");
            userGuessNumber = sc.nextInt();
            attempt++;

            if(userGuessNumber<randomNumGenerate)
            {
                System.out.println("Your number is too low , Try again..");
            } 
            else if(userGuessNumber>randomNumGenerate)
            {
                System.out.println("your number is too high, Try again..");
            }
            else
            {
                System.out.println("Great!! You guess the correct number in " + attempt + "attempts");
            }

        }
        sc.close();
    }
}

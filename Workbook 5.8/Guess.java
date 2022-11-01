import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class Guess  {
    public static void main(String[] args) {

       /* Task 1 
            1. Store a "secret" number between 1 and 5. 
            2. Then, prompt the user to enter a guess.
       */
    
       int secretNum = 4;
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       Scanner scan = new Scanner(System.in);
       int guess = scan.nextInt();

        while (guess != secretNum) {
            System.out.println("Guess again: ");
            guess = scan.nextInt();
        }
        
        System.out.println("You guessed it!");

        scan.close();
    }
}

import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Let's play Rolling Java. Type anything to start.");
      String gameStart = scan.nextLine();

      System.out.println("Great! Here are the rules:\n- If you roll a 6, the game ends.\n- If you roll a 4, nothing happens.\n- Otherwise, for everything else, you get 1 point.\nYou must earn 3 points in order to win. Enter anything to roll:");

      int score = 0;
      
      while (true) {
        String randomVal = scan.nextLine();
        int diceRoll = rollDice();
        System.out.println("You rolled a " + diceRoll + ".");
        if (diceRoll == 6) {
          System.out.println("Game over.");
          break;
        } else if (diceRoll == 4) {
          System.out.println("No points awarded. Keep rolling.");
          continue;
        } else {
          score++;
          System.out.println("One point gained. Keep rolling.");
          continue;
        }
      }
        
      System.out.println("\nYour score is: " + score + ".");
      if (score >= 3) {
        System.out.println("\nWow, nice job, lucky shot. You win!");
      } else {
        System.out.println("\nYou lose. Maybe next time.");
      }
      scan.close();

        // System.out.println("\nPlay again? Enter yes or no.");
        // String gameRestart = scan.nextLine();

        // if (gameRestart.equals("yes")) {
        //   System.out.println("Let's play Rolling Java. Type anything to start.");
        //   while (true) {
        //     String randomVal = scan.nextLine();
        //     int diceRoll = rollDice();
        //     System.out.println("You rolled a " + diceRoll + ".");
        //     if (diceRoll == 6) {
        //       System.out.println("Game over.");
        //       break;
        //     } else if (diceRoll == 4) {
        //       System.out.println("No points awarded. Keep rolling.");
        //       continue;
        //     } else {
        //       score++;
        //       System.out.println("One point gained. Keep rolling.");
        //       continue;
        //     }
        //   }
        // } else {
        //   System.exit(0);
        // }

    }
  
    public static int rollDice() {
      double randomNum = Math.random() * 6;
      randomNum = randomNum + 1;
      return (int)randomNum;
    }

}

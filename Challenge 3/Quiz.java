import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String a1 = scan.nextLine();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String a2 = scan.nextLine();


        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String a3 = scan.nextLine();


        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String a4 = scan.nextLine();


        int score = 0;


        if (a1.equals('c')) {
            score += 5;
        } else {
            System.out.println("The correct answer is c: Brazil.");
        } if (a2.equals('a')) {
            score += 5;
        } else {
            System.out.println("The correct answer is a: Venus.");
        } if (a3.equals('d')) {
            score += 5;
        } else  {
            System.out.println("The correct answer is d: AB-Negative");
        } if (a4.equals('a') || a4.equals('b')) {
            score += 5;
        } else {
            System.out.println("The correct answer is either a: Ron Weasley, or b: Hermione Granger.");
        }
        
        System.out.println("\nYour final score is: " + score + "/20");

        if (score >= 15) {
            System.out.println("\nWow, you know your stuff!");
        } else if (score > 5 && score < 15) {
            System.out.println("\nNot bad.");
        } else {
            System.out.println("\nBetter luck next time.");
        }

        scan.close();

    }
}
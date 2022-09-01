import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome! Thank you for taking the survey.");
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        int counter = 0;
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;
        
        System.out.println("\nHow many times a week to you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nHow many times a week to you buy food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name + " for answering all " + counter + " questions!");
        System.out.println("You food expenses are " + (foodPrice / coffeePrice) + " times more than your coffee expenses.");
        System.out.println("Weekly you spend in $" + (coffeeAmount * coffeePrice) + " on coffee.");
        System.out.println("YWeekly you spend in $" + (foodAmount * foodPrice) + " on food.");
        scan.close();
    }
}

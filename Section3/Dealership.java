import java.util.Scanner;

import javax.swing.plaf.synth.SynthToolBarUI;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership!");
        System.out.println("- Select Option 'a' to buy a car.");
        System.out.println("- Select Option 'b' to sell a car.");
        String option = scan.nextLine();
        switch (option) {
            case "a": 
                System.out.println("\nWhat is your budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available!");
                    System.out.println("\nDo you have insurance? Print 'yes' or 'no'.");
                    String decoy = scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a driver's license? Print 'yes' or 'no'.");
                    String license = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && creditScore > 660) {
                        System.out.println("\nSold! Pleasure doing business with you!");
                    } else {
                        System.out.println("We're sorry. You are not eligible to purchase the vehicle.");
                    }
                } else {
                    System.out.println("I'm sorry, we don't sell cars under 10000.");
                }
            case "b": 
                System.out.println("\nWhat is the value of your car?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();
                
                if (value > price && price < 30000) {
                    System.out.println("\nWe will buy your car! Pleasure doing business with you!");
                } else {
                    System.out.println("\nSorry, we're not interested. Have a great day.");
                }
            break;
            default: System.out.println("\nInvalid option.");
        }
        scan.close();
    }
}

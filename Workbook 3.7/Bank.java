import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String answer = scan.nextLine();

        switch (answer) {
            case "yes":
                //Task 2 - Print this if the decision is "yes"
                System.out.println("\nGreat! \nIn one line," + " how much money do you have in your savings?" + "\nAnd, how much do you owe in credit card debt?");
                // Task 3 - Pick up each value 
                double savings = scan.nextDouble();
                double debt = scan.nextDouble();
                System.out.println("\nHow many years have you worked for?");
               // Task 4 - Pick up number of years
                int work = scan.nextInt();
                System.out.println("\nWhat is your name?");
               // Task 5 - Pick up the user's name
                String decoy = scan.nextLine();
                String name = scan.nextLine();
               //Task 6 - Approve the mortgage if they meet the requirements (see article)
               //       - Otherwise, don't give them a mortgage.          
                if (savings >= 10000 && debt < 5000 && work >= 2) {
                    System.out.println("\nCongratulations, " + name + "! You have been approved!");
                } else {
                    System.out.println("\nSorry, you are not eligible for a mortgage.");
                }      
            break;
            //Task 2 - Print this if the decision was not "yes"
            case "no":
                System.out.println("\nOK. Have a nice day!");        
            break;
            default: System.out.println("\nInvalid option.");
        scan.close();
        }
    }
}
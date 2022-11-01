import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");

        //Ask for their first name.
        System.out.println("\nWhat is your first name?");
        String firstName = scan.nextLine();

        //Ask for their last name.
        System.out.println("\nWhat is your last name?");
        String lastName = scan.nextLine();

        //Ask: how old are you?
        System.out.println("\nEnter your age: ");
        int age = scan.nextInt();

        System.out.println("\nChoose a username: ");
        String decoy = scan.nextLine();
        String username = scan.nextLine();

        //Ask what city they live in.
        System.out.println("\nWhat city do you live in?");
        String city = scan.nextLine();

        //Ask what country that's from.
        System.out.println("\nWhat country is that from?");
        String country = scan.nextLine();

        System.out.println("Thank you for joining JavaGram!");

        System.out.println("\nYour information:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        //close scanner. 
        scan.close();
    }
}

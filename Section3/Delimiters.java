import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers (on the same line).");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter very big two integers (on the same line).");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();

        System.out.println("Enter two decimals (on the same line).");
        double dec1 = scan.nextDouble();
        double dec2 = scan.nextDouble();

        System.out.println("Enter two text values (on the same line).");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();

        System.out.println("\tIntegers: " + num1 + " " + num2);
        System.out.println("\tIntegers: " + bigNum1 + " " + bigNum2);
        System.out.println("\tIntegers: " + dec1 + " " + dec2);
        System.out.println("\tIntegers: " + text1 + " " + text2);
    }
}

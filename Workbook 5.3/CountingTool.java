import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hi Timmy! Choose a number to count to:\t");
        int choice = scan.nextInt();

        for (int count = 0; count <= choice; count++) {
            System.out.print(count + "  ");
        }

        scan.close();
    }
}

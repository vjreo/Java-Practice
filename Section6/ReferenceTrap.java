import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        // occurs when you set array values equal to each other
        // both variables point to the same array
        // Solution is to create a new array and then copy every value using a loop
        // Better solution is to set it equal to a copy of the array (Arrays.copyOf)

        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}

public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congratulations, you got the scholarship!");
        } else {
            System.out.println("We're sorry. You did not get the scholarship.");
        }

        int credits = 56;
        double GPA = 3.4;

        if (credits >= 40 && GPA >= 3.0) {
            System.out.println("You earned your diploma!");
        } else {
            System.out.println("Sorry, you need at least 40 credits and a minimum GPA of 3.0.");
        }



    }
}

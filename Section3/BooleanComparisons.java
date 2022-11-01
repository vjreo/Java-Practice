public class BooleanComparisons {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;

        System.out.println(biologyGrade > chemistryGrade);
        System.out.println(englishGrade < chemistryGrade);
        System.out.println(biologyGrade <= englishGrade);
        System.out.println(biologyGrade != englishGrade);
        System.out.println(chemistryGrade == biologyGrade);

        // note: never use == or -= to compare String values. Use string.equals(string)
        String sentence1 = "I love this course!";
        String sentence2 = "I love this course!";
        System.out.println(sentence1.equals(sentence2));
        System.out.println(!sentence1.equals(sentence2));

        double sales = 37.55;
        double costs = 5.55;

        System.out.println(sales > costs);


    }
}

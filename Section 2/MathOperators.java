public class MathOperators {
    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;
        long starsInMilkyWay = 250000000L;
        long starsInAndrometta = 1000000000000L;
        double testScore = 6.7; 
        double bonusMarks = 2.5;

        System.out.println(bagOfSweets1 + bagOfSweets2);
        System.out.println(starsInMilkyWay + starsInAndrometta);
        System.out.println(testScore + bonusMarks);
        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets");
        System.out.println("There are " + (starsInMilkyWay + starsInAndrometta) + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " + (testScore + bonusMarks) + " points on his potions test. Snape wasn't too thrilled..");

        System.out.println(bagOfSweets1 - bagOfSweets2);
        System.out.println(starsInMilkyWay - starsInAndrometta);
        System.out.println(testScore - bonusMarks);
        

        System.out.println("Fred has " + (bagOfSweets1 - bagOfSweets2) + " more sweets than George.");
        System.out.println("The Andromeda Galaxy has " + (starsInMilkyWay - starsInAndrometta) + " more stars than the Milky Way.");
        System.out.println("Snape ended up removing marks. Ron actually scored " + (testScore - bonusMarks) + " on his potions test.");


        System.out.println(bagOfSweets1 * bagOfSweets2);
        System.out.println(starsInMilkyWay * starsInAndrometta);
        System.out.println(testScore * bonusMarks);
        System.out.println("Fred and George used a special spell to multiply their sweets to: " + (bagOfSweets1 * bagOfSweets2));
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore * bonusMarks/10));


        System.out.println(bagOfSweets2 / bagOfSweets1);
        System.out.println(starsInAndrometta / starsInMilkyWay);
        System.out.println(bonusMarks / testScore);
        System.out.println("Originally, Fred had " + (bagOfSweets2 / bagOfSweets1) + " times more sweets than George");
        System.out.println("Andromeda has " +  (starsInAndrometta / starsInMilkyWay) + " times more stars");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (bonusMarks / testScore));

    }
}

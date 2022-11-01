public class Tip {

    public static void main(String[] args) {
        double bill = 65.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
    
        //Task 2: Call a function that tips the waiter.
        tipTheWaiter(bill);
    }



    
    //Task 1: Make a function here. See the doc comment for details.  
    public static void tipTheWaiter(double bill) {
        double rawTip = (bill * .15);
        double tip = Math.round(rawTip);
        System.out.println("Your service was wonderful! Please accept this tip: $" + tip);
    }

    /**
     * Function name: tipTheWaiter - calculates a tip and prints it.
     * @param bill (double).
     * 
     * Inside the function:
     *  1. Calculates a tip that's 15 percent of bill.
     *  2. Prints: Your service was wonderful! Please, accept this tip: $<tip>
     */

}
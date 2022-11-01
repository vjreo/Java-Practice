public class Meeting {
    public static void main(String[] args) {
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 
        
        int estSales = (int)sales;
        int estProfit = (int)profit;
        int estRefunds = (int)refunds;
        int estShipping = (int)shipping;

        System.out.println("This month, we made $" + estSales + " in sales");
        System.out.println("Factoring in costs, we made $" + estProfit + " in profit");
        System.out.println("The refunds are at a low $" + estRefunds + " . This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + estShipping + " in shipping");


    }
}
public class ReturnValues {
    public static void main(String[] args) {
            double measure1 = measureRectangle(3.2, 4.1, "area");
            double measure2 = measureRectangle(3.5, 1.2, "perimeter");


            stringPrinter(3.2, 4.1, measure1, "area");
            stringPrinter(3.5, 1.2, measure2, "perimeter");
        }
    
        public static double measureRectangle(double length, double width, String option) {
            if (length < 0 || width < 0) {
                System.out.println("length nor width cannot be negative");
                System.exit(0);
            }
            switch (option) {
                case "area": return length * width;
                case "perimeter": return 2 * (length * width);
                default: return 404;
            }
        }

        public static void stringPrinter(double length, double width, double measure, String option) {
            System.out.println("The " + option + " of the rectangle with length of " + length + " and width of " + width + " is equal to " + measure + "\n");
        }
}

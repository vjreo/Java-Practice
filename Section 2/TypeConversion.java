public class TypeConversion {
    public static void main(String[] args) {
        double salary = 80200.10010;
        int roundedSalary = (int)salary;
        System.out.println("Vince's monthly salary is: $" + roundedSalary);

        double modulo = 487 % 15;
        int dividend = 487 / 32; 

        System.out.println(modulo);
        System.out.println(dividend);
    }
}

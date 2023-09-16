package results;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator(0.00);

        System.out.println(calc.add(12.00, 78.00));
        System.out.println(calc.multiply(3.00, 33.00));
        System.out.println(calc.divide(144.00, 12.00));
        System.out.println(calc.subtract(400.00, 150.00));
        calc.squareRoot(121.00);
        System.out.println(calc.exponent(7, 3.00));
    }
}

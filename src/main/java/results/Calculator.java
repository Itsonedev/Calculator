package results;

public class Calculator {
    public double defaultValue;


    public Calculator(double defaultValue){
        this.defaultValue = defaultValue;
    }
    public double add(double number1, double number2)
    {
        return this.defaultValue = (number1 + number2);
    }
    public double multiply(double number1, double number2){
        return this.defaultValue = (number1 * number2);
    }
    public double divide(double dividend, double divisor){
        return this.defaultValue = (dividend / divisor);
    }
    public double subtract(double number1, double number2){
        return this.defaultValue = (number1 - number2);
    }
    public void squareRoot(double squareRootValue){
        if (squareRootValue < 0){
            System.out.println("Cannot calculate square root of negative number");
        }else {
            double result = Math.sqrt(squareRootValue);
            System.out.println("Square root of "+ squareRootValue + " is " + result);
        }
    }
    public double exponent(double base, double exponent){
        return this.defaultValue = (Math.pow(base, exponent));
    }

}

 

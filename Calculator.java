public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Calculator <operator> <number1> <number2>");
            return;
        }

        String operator = args[0];
        double num1, num2;

        try {
            num1 = Double.parseDouble(args[1]);
            num2 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter numbers only.");
            return;
        }

        double result = calculate(operator, num1, num2);
        System.out.println("Result: " + result);
    }

    public static double calculate(String operator, double num1, double num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator. Please use +, -, *, or /");
        }
    }
}
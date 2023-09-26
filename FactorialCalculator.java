public class FactorialCalculator {
    public static void main(String[] args) {
        try {
            int number = 11;
            int result = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (CustomFactorialException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int calculateFactorial(int n) throws CustomFactorialException {
        if (n < 1 || n > 10) {
            throw new CustomFactorialException();
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

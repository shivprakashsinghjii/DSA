public class Fibonacci {

    // Recursive method to find Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Find the first 10 Fibonacci numbers
        System.out.println("Fibonacci number at position " + n + " is " + fibonacciRecursive(n));
    }
}

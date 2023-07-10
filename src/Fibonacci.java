public class Fibonacci {
//Problem 5
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int num = 5;
        int result = fibonacci(num);
        System.out.println("The " + num + "-th element in the Fibonacci sequence is: " + result);
    }
}


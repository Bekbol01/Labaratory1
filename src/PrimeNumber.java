public class PrimeNumber {
//Problem 3
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }

        if (n % i == 0) {
            return false;
        }

        if (i * i > n) {
            return true;
        }

        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = isPrime(num, 2);
        System.out.println(num + (isPrime ? " is prime." : " is composite."));
    }
}

public class BinomialCoefficient {
//Problem 9
    public static int calculateCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        return calculateCoefficient(n - 1, k - 1) + calculateCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        int n1 = 2;
        int k1 = 1;
        int result1 = calculateCoefficient(n1, k1);
        System.out.println("C(" + n1 + ", " + k1 + ") = " + result1);

        int n2 = 7;
        int k2 = 3;
        int result2 = calculateCoefficient(n2, k2);
        System.out.println("C(" + n2 + ", " + k2 + ") = " + result2);
    }
}


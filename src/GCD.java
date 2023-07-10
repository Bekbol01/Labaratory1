public class GCD {
    //Problem 10
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        int gcd = findGCD(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
    }
}


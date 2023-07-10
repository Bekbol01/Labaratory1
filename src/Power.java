public class Power {
//Problem 6
    public static int calculatePower(int a, int n) {
        if (n == 0) {
            return 1;
        }

        return a * calculatePower(a, n - 1);
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        int result = calculatePower(a, n);
        System.out.println(a + " ^ " + n + " = " + result);
    }
}

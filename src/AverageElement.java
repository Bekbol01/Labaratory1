public class AverageElement {
//Problem 2
    public static double findAverage(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        double sum = arr[n - 1] + findAverage(arr, n - 1) * (n - 1);
        return sum / n;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        int n = arr.length;
        double result = findAverage(arr, n);
        System.out.println("The average is: " + result);
    }
}


public class MinimumElement {
//Problem 1
    public static int findMinimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int minimum = findMinimum(arr, n - 1);

        if (arr[n - 1] < minimum) {
            return arr[n - 1];
        } else {
            return minimum;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        int n = arr.length;
        int result = findMinimum(arr, n);
        System.out.println("The minimum element is: " + result);
    }
}

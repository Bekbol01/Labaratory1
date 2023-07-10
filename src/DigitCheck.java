public class DigitCheck {
//Problem 8
    public static boolean isAllDigits(String s) {
        if (s.length() == 0) {
            return true;
        }

        char c = s.charAt(0);

        if (!Character.isDigit(c)) {
            return false;
        }

        return isAllDigits(s.substring(1));
    }

    public static void main(String[] args) {
        String s1 = "123456";
        System.out.println(s1 + (isAllDigits(s1) ? " consists of digits." : " does not consist of digits."));

        String s2 = "123a12";
        System.out.println(s2 + (isAllDigits(s2) ? " consists of digits." : " does not consist of digits."));
    }
}

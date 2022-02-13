package Java1lesson1;

public class L1N2 {
    public static void main (String[] args) {
        checkSumSign(-10, 25);
        checkSumSign(-50, 25);
        checkSumSign(-10, 10);
    }

    public static void checkSumSign(int a, int b) {
        System.out.println("Sum is " + (a + b >= 0 ? "positive" : "negative"));
    }
}

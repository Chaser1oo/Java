package Java1Lesson2;

public class L2N2 {
    public static void main (String[] args) {
        isPositiveOrNegative(7);
        isPositiveOrNegative(0);
        isPositiveOrNegative(-123);
    }

    static void isPositiveOrNegative(int a) {
        System.out.println(a >= 0 ? "positive" : "negative");
    }
}

package Java1Lesson2;

public class L2N3 {
    public static void main(String[] args) {
        isNegative(-50);
        isNegative(0);
        isNegative(50);
    }

    static boolean isNegative(int c) {
        return (c < 0);
    }
}

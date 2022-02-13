package Java1lesson1;

public class L1N4 {
    public static void main (String[] args) {
        compareNumbers(-10, -25);
        compareNumbers(-10, 5);
        compareNumbers(-10, -10);
    }

    public static void compareNumbers(int a, int b) {
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}

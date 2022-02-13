package Java1lesson1;

public class L1N3 {
    public static void main (String[] args) {
        printColor(-10);
        printColor(50);
        printColor(110);
    }
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        }
        else if ( value > 0 & value <= 100 ) {
            System.out.println("Yellow");
        }
        else {
            System.out.println("Green");
        }
    }
}

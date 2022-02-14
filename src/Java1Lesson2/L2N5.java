package Java1Lesson2;

public class L2N5 {
    public static void main (String[] args) {
        checkYear(800);
        checkYear(200);
        checkYear(20);
        checkYear(3);
        checkYear(20);
    }

    static boolean checkYear(int checkYear) {
        return (checkYear % 4 ==0 && checkYear % 100 !=0) || checkYear % 400 ==0;
    }
}


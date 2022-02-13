package Java1Lesson2;

public class L2N1 {
    public static void main (String[] args) {
        within10and20(23, -23);
        within10and20(23, -7);
        within10and20(23, -57);
    }

    //static boolean within10and20(int a, int b) {
    //    int sum = a + b;
    //    if (sum >= 10 && sum <= 20) {
    //        return true;
    //    } else {
    //        return false;
    //    }
    //}

    static boolean within10and20(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }
}

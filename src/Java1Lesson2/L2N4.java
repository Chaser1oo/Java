package Java1Lesson2;

public class L2N4 {
    public static void main (String[] args) {
        //printWord();
        printWord("World", 7);
    }
    static void printWord(String x, int z){
        for (int p = 0; z > p; p++) {
            if (p > z) {
                break;
            }
            System.out.println( x );
        }
    }
}

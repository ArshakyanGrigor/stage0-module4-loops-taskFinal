package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int count = cathetusLength + 1;
        int upCount = 1;
        for (int i = 1; i < cathetusLength + 1; i++) {
            for (int n = (cathetusLength) - i; n > 0; n--) {
                count--;
                System.out.print(" ");
            }
            for (int m = 0; m <= ((2 * i) - 2); m++) {
                if (count == 1) {
                    upCount++;
                    System.out.print(upCount);
                } else {
                    count--;
                    System.out.print(count);
                }
            }
            for (int j = (cathetusLength) - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
            count = cathetusLength + 1;
            upCount = 1;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++){

            for(int j = i; j <= cathetusLength; j++) {
                System.out.print(" ");
            }
            for(int j = 1, k = i; j < i; j++, k--) {

                System.out.print(k);
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        new Pyramid().printPyramid(7);
    }
}

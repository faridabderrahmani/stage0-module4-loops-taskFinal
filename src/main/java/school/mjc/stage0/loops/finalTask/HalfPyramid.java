package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for(int i = 1; i <= cathetusLength/2+1; i++){
            for(int j = i; j <= cathetusLength/2+1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        new HalfPyramid().printHalfPyramid(8);
    }
}

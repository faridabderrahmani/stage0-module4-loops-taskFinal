package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public static void main(String[] args) {
        printTable(0);
    }
    public static void printTable(int numberTableToPrint){
        for(int i = 1; i<= 9; i++){
            System.out.println(i + " x " + numberTableToPrint + " = " + numberTableToPrint*i);
        }
    }
}

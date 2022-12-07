package school.mjc.stage0.loops.task2;

public class FactorialNumbers {

    public static void main(String[] args) {
        printFactorialRow(7);
    }

    public static void printFactorialRow(int printToInclusive) {
        int n = 0;
        int res = 1;
        if (printToInclusive == 0) {
            System.out.println(res);
        } else {
            System.out.println(res);
            while (n < printToInclusive) {
                System.out.println(res *= n + 1);
                n++;
            }
        }
    }
}

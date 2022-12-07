package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 1;
        int count = 0;
        while (i <= printToInclusive) {
            count = 0;
            i++;
            int j = 1;
            while (j <= i) {
                if (i % j == 0) {
                    count++;
                }
                j++;
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}

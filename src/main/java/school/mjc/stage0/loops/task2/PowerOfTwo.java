package school.mjc.stage0.loops.task2;

public class PowerOfTwo {

    public static void main(String[] args) {
        printPower(4);
    }
    public static void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int n = 0;
            while (n <= power) {
                int res = (int) Math.pow(2, n);
                System.out.println(res);
                n++;
            }
        }
    }
}

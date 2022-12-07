package school.mjc.stage0.loops.task2;

public class Multiplication {

    public static void main(String[] args) {
        printMultiplied(-5);
    }
    public static void printMultiplied(int multiplyByAndToInclusive) {
        int n = 0;
        if (multiplyByAndToInclusive > 0) {
            while (n <= multiplyByAndToInclusive) {
                System.out.println(n*multiplyByAndToInclusive);
                n++;
            }
        } else if (multiplyByAndToInclusive < 0){
            while (n >= multiplyByAndToInclusive) {
                System.out.println(n*multiplyByAndToInclusive*-1);
                n--;
            }
        }
    }
}

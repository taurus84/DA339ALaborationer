package f20;
import java.util.Arrays;

public class Sorting {

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 20 == 0) {
                System.out.println();
            }
            System.out.printf("%5d", array[i]);
        }
    }

    public void sortEx() {
        int[] array = new int[100];
        RandomArray ra = new RandomArray();

        ra.fillRandom(array, 400, 600);
        printArray(array);
        Arrays.sort(array);
        System.out.println();
        printArray(array);
    }

    public static void main(String[] args) {
        Sorting sort = new Sorting();
        sort.sortEx();
    }
}

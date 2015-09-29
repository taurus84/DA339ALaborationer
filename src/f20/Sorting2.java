package f20;

public class Sorting2 {
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 20 == 0) {
                System.out.println();
            }
            System.out.printf("%5d", array[i]);
        }
    }

    public void sortEx() {
        int[] array = new int[200];
        RandomArray ra = new RandomArray();

        ra.fillRandom(array, -100, 100);
        printArray(array);
        Selectionsort.sort(array);
        System.out.println();
        printArray(array);
    }

    public static void main(String[] args) {
        Sorting2 sort = new Sorting2();
        sort.sortEx();
    }
}

package f20;

public class TestRandomArray {
    public void test() {
        RandomArray sf = new RandomArray();
        int[] nbrs = new int[100];
        double[] realValues = new double[15];

        sf.fillRandom(nbrs, 100, 120);
        System.out.println("Hela slumptal");
        for (int i = 0; i < nbrs.length; i++) {
            System.out.printf("%4d", nbrs[i]);
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        sf.fillRandom(realValues, -20, 5);
        System.out.println("\nDecimala slumptal");
        for (int i = 0; i < realValues.length; i++) {
            System.out.printf("%17.6f\n", realValues[i]);
        }
    }

    public static void main(String[] args) {
        TestRandomArray tra = new TestRandomArray();
        tra.test();
    }
}

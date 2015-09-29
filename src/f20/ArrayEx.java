package f20;

public class ArrayEx {

    public boolean member(int nbr, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (nbr == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public void fillRandom(int[] array) {
        int rnd;
        for (int i = 0; i < array.length; i++) {
            do {
                rnd = (int) (Math.random() * 20) + 1;
            } while (member(rnd, array));
            array[i] = rnd;
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void action(int count) {
        int[] nbrs = new int[count];
        fillRandom(nbrs);
        System.out.print("tal = ");
        printArray(nbrs);
    }

    public static void main(String[] args) {
        ArrayEx prog = new ArrayEx();
        prog.action(10);
    }
}

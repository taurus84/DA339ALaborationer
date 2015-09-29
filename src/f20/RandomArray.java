package f20;

import java.util.Random;

public class RandomArray {
	private Random random = new Random();
	
    public void fillRandom(int[] array, int min, int max) {
        if (max >= min) {
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    public void fillRandom(double[] array, int min, int max) {
        if (max >= min) {
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextDouble() * (max - min) + min;
            }
        }
    }
}

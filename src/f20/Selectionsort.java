package f20;

public class Selectionsort {
    // Klassmetod, innehåller modifieraren  static
    // Kan ej använda attribut och metoder (instansmetoder) i samma klass
    public static void sort(int[] array) {
        int toSwap, temp;
        for (int index = 0; index <= array.length - 2; index++) {
            toSwap = index;
            for (int i = index + 1; i <= array.length - 1; i++) {
                if (array[i] < array[toSwap]) {
                    toSwap = i;
                }
            }
            temp = array[index];
            array[index] = array[toSwap];
            array[toSwap] = temp;
        }
    }
}

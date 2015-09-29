package laboration20;

import java.util.*;

public class Exercise20f {
	public void program() {
		Population[] countries = Populations.readPopulations("src/laboration20/befolkning.txt");
		Arrays.sort(countries, new AlphabeticalOrder());
		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i].toString());
		}
	}

	public static void main(String[] args) {
		Exercise20f e20f = new Exercise20f();
		e20f.program();
	}
}
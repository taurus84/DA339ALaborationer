package laboration20;

import java.util.*;

public class Exercise20e {
	public void program() {
		Population[] countries = Populations.readPopulations("src/laboration20/befolkning.txt");
		Arrays.sort(countries);
		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i].toString());
		}
	}

	public static void main(String[] args) {
		Exercise20e e20d = new Exercise20e();
		e20d.program();
	}
}
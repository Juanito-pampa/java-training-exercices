package io.robusta.animals.types;

import java.util.Arrays;

import io.robusta.animals.Pingouin;

public class ArrayApp {

	public static void main(String[] args) {

		Pingouin kowalsky = new Pingouin("Kowalsky");
		Pingouin ricoh = new Pingouin("Ricoh");
		Pingouin soldat = new Pingouin("Soldat");
		Pingouin commandant = new Pingouin("Commandant");
		Pingouin tux = new Pingouin("Tux");

		Pingouin[] pingouins = new Pingouin[5];
		pingouins[0] = kowalsky;
		pingouins[1] = ricoh;
		pingouins[2] = soldat;
		pingouins[3] = commandant;
		pingouins[4] = tux;
		
		Pingouin third = pingouins[2]; // lecture (getter)
		System.out.println(third);
		
		System.out.println(Arrays.toString(pingouins));

		
		// création tableau
		
		// direct
		
		Pingouin[] directpingouins = {kowalsky, ricoh, tux};
		
		Pingouin[] almostDirectpingouins = new Pingouin[]{kowalsky, ricoh, tux};
		
		almostDirectpingouins = new Pingouin[]{ricoh, tux};
		
		int length = almostDirectpingouins.length;
		
		Pingouin last = almostDirectpingouins[length-1];
		
		//waring lenght of string .... strange...
		boolean equals = "Jo".length() == almostDirectpingouins.length;
		
		
	}
	

}

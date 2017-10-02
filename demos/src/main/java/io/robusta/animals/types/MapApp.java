package io.robusta.animals.types;

import java.util.HashMap;
import java.util.Map.Entry;

import io.robusta.animals.Pingouin;

public class MapApp {

	public static void main(String[] args) {
		MapApp app = new MapApp();
		app.init();
		app.iterateEntry();
	}

	public void init() {

		Pingouin kowalsky = new Pingouin("Kowalsky");
		Pingouin ricoh = new Pingouin("Ricoh");
		Pingouin soldat = new Pingouin("Soldat");
		Pingouin commandant = new Pingouin("Commandant");
		Pingouin tux = new Pingouin("Tux");

		HashMap<Pingouin, Integer> map = new HashMap<>();

		map.put(tux, 90);
		map.put(ricoh, 220);
		map.put(soldat, 2);
		map.put(commandant, 1);
		map.put(kowalsky, 520);

		System.out.println(map);

		System.out.println(map.get(kowalsky));

		System.out.println("map size :" + map.size());

		map.put(soldat, 14);

		System.out.println(map.get(soldat));

	}
	
	public void iterateEntry(){
		
		Pingouin kowalsky = new Pingouin("Kowalsky");
		Pingouin ricoh = new Pingouin("Ricoh");
		Pingouin soldat = new Pingouin("Soldat");
		Pingouin commandant = new Pingouin("Commandant");
		Pingouin tux = new Pingouin("Tux");

		HashMap<Pingouin, Integer> map = new HashMap<>();

		map.put(tux, 90);
		map.put(ricoh, 220);
		map.put(soldat, 2);
		map.put(commandant, 1);
		map.put(kowalsky, 520);
		
		for (Entry<Pingouin, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() + " has " + entry.getValue() + " points");
		}
		
		System.out.println(map);
	}
	

}

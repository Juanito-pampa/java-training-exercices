package io.robusta.animals.types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.sound.midi.ControllerEventListener;

import io.robusta.animals.Pingouin;


public class ListApp {
	
	Pingouin kowalsky = new Pingouin("Kowalsky");
	Pingouin ricoh = new Pingouin("Ricoh");
	Pingouin soldat = new Pingouin("Soldat");
	Pingouin commandant = new Pingouin("Commandant");
	Pingouin tux = new Pingouin("Tux");

	public static void main(String[] args) {
		ListApp app = new ListApp();
		app.iterate();

	}

	void launch(){
		
	LinkedList<Pingouin> pingouins = new LinkedList<>();
	Collections.addAll(pingouins, kowalsky, ricoh, soldat, commandant, tux);
	
	System.out.println(pingouins);
	
	Pingouin last = pingouins.getLast();
	last = pingouins.peekLast();
	
	Pingouin first =pingouins.getFirst();
	first = pingouins.peekFirst();
	first = pingouins.get(0);
	
	Pingouin second = pingouins.get(1);
	
	
	int length = pingouins.size();
	Pingouin penult = pingouins.get(length-2);
	
	Pingouin middle = pingouins.get((length/2)-1);
	
	
		
}
	void mix(){
		
		List<Pingouin> list = new ArrayList<>();
		Collections.addAll(list, kowalsky, ricoh, soldat, commandant, tux);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		list = new LinkedList();
		
		
		
	}
	void iterate(){
		List<Pingouin> pingouins = new ArrayList<>();
		Collections.addAll(pingouins, soldat, tux, kowalsky, commandant, ricoh);
		
		for(Pingouin current : pingouins){
			System.out.println(current);
			
		}
		
		
		
		
		
		
	}
}

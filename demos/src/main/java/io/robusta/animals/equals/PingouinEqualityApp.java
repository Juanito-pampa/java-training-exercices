package io.robusta.animals.equals;

import io.robusta.animals.Pingouin;

public class PingouinEqualityApp {

	public static void main(String[] args) {
		
		PingouinEqualityApp app = new PingouinEqualityApp();
			app.launch();
		}
		
		
		public void launch(){
			
			Pingouin jack = new Pingouin("Jack");
			Pingouin john = new Pingouin("John");
			System.out.println(jack.equals(john));
			
			john.setName("Jack");
			
			System.out.println(jack.equals(john));
		}
		
}

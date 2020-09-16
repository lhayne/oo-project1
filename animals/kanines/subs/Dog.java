package animals.kanines.subs;

import animals.kanines.Kanine;

public class Dog extends Kanine {
	/*
	Dog class
	Attributes : None
	methods : wake : animal prints wake message
			  makeNoise : animal prints noise message
			  eat : animal prints eating message
			  roam : animal prints roaming message
			  sleep : animal prints sleeping message
			  getName : returns the name of the animal
			  getFullTitle : returns full animal title
	*/

	public Dog(String givenName){
		super(givenName,"Dog");
	}
	// OVERRIDING
	public void roam(){
		if (Math.random() < 0.25){
			System.out.println(getFullTitle() + " digs.");
		}
		else {
			System.out.println(getFullTitle() + " roams.");
		}
		
	}
}
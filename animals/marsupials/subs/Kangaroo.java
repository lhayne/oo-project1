package animals.marsupials.subs;

import animals.marsupials.Marsupial;

public class Kangaroo extends Marsupial {
	/*
	Kangaroo class
	Attributes : None
	methods : wake : animal prints wake message
			  makeNoise : animal prints noise message
			  eat : animal prints eating message
			  roam : animal prints roaming message
			  sleep : animal prints sleeping message
			  getName : returns the name of the animal
			  getFullTitle : returns full animal title
	*/
	public Kangaroo(String givenName){
		super(givenName, "Kangaroo");
	}
	public void roam(){
		System.out.println(getFullTitle() + " kicks a visitor and bounds away.");
	}
}
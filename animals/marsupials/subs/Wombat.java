package animals.marsupials.subs;

import animals.marsupials.Marsupial;

public class Wombat extends Marsupial {
	/*
	Wombat class
	Attributes : None
	methods : wake : animal prints wake message
			  makeNoise : animal prints noise message
			  eat : animal prints eating message
			  roam : animal prints roaming message
			  sleep : animal prints sleeping message
			  getName : returns the name of the animal
			  getFullTitle : returns full animal title
	*/
	public Wombat(String givenName){
		super(givenName, "Wombat");
	}
}
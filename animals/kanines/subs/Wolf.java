package animals.kanines.subs;

import animals.kanines.Kanine;

public class Wolf extends Kanine {
	/*
	Wolf class
	Attributes : None
	methods : wake : animal prints wake message
			  makeNoise : animal prints noise message
			  eat : animal prints eating message
			  roam : animal prints roaming message
			  sleep : animal prints sleeping message
			  getName : returns the name of the animal
			  getFullTitle : returns full animal title
	*/

	public Wolf(String givenName){
		super(givenName,"Wolf");
	}
}
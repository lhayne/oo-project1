package animals.felines.subs;

import animals.felines.Feline;

public class Lion extends Feline {
	/*
	Lion class
	Attributes : None
	methods : wake : animal prints wake message
			  makeNoise : animal prints noise message
			  eat : animal prints eating message
			  roam : animal prints roaming message
			  sleep : animal prints sleeping message
			  getName : returns the name of the animal
			  getFullTitle : returns full animal title
	*/
	public Lion(String givenName){
		super(givenName,"Lion");
	}
}
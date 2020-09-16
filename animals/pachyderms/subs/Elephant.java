package animals.pachyderms.subs;

import animals.pachyderms.Pachyderm;

public class Elephant extends Pachyderm {
	/*
	Elephant class
	Attributes : None
	methods : wake : animal prints wake message
			  makeNoise : animal prints noise message
			  eat : animal prints eating message
			  roam : animal prints roaming message
			  sleep : animal prints sleeping message
			  getName : returns the name of the animal
			  getFullTitle : returns full animal title
	*/
	public Elephant(String givenName){
		super(givenName,"Elephant");
	}
}
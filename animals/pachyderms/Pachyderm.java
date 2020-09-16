package animals.pachyderms;

import animals.Animal;

public class Pachyderm extends Animal {

	public Pachyderm(String givenName, String givenType){
		super(givenName, givenType);
	}
	public void roam(){
		if (Math.random() < 0.25){
			System.out.println(getFullTitle() + " charges.");
		}
		else {
			System.out.println(getFullTitle() + " roams.");
		}
		
	}
}
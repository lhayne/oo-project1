import Animal;

public class Pachyderm extends Animal {

	public Pachyderm(String givenName){
		super(givenName);
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
import Kanine;

public class Dog extends Kanine {

	public Dog(String givenName){
		super(givenName);
	}
	public void roam(){
		if (Math.random() < 0.25){
			System.out.println(getFullTitle() + " digs.");
		}
		else {
			System.out.println(getFullTitle() + " roams.");
		}
		
	}
}
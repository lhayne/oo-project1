import Animal;

public class Feline extends Animal {

	public Feline(String givenName){
		super(givenName);
	}
	public void sleep(){
		double rand = Math.random();
		if (rand < 0.3){
			System.out.println(getFullTitle() + " roams.");
		}
		else if ((rand >= 0.3) && (rand < 0.6)){
			System.out.println(getFullTitle() + " makes noise.");
		}
		else {
			System.out.println(getFullTitle() + " sleeps.");
		}
	}
}
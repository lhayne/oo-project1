import animals.*;
import employees.*;
import java.util.*;

public class myZoo {

	// Starting point for program
	public static void main(String args[]){
		// Code for user input from https://www.javatpoint.com/how-to-take-string-input-in-java
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days the Zoo should operate: ");
		int totalDays = Integer.parseInt(sc.nextLine());

		// POLYMORPHISM : This is an example of polymorphism because all of these
		// specific animals can be referred to as superclass Animals.
		Animal[] zoo = new Animal[10];
		zoo[0] = new animals.felines.subs.Cat("Carl");
		zoo[1] = new animals.felines.subs.Tiger("Tina");
		zoo[2] = new animals.felines.subs.Lion("Lily");
		zoo[3] = new animals.kanines.subs.Dog("Doug");
		zoo[4] = new animals.kanines.subs.Wolf("Willy");
		zoo[5] = new animals.pachyderms.subs.Rhino("Ryan");
		zoo[6] = new animals.pachyderms.subs.Elephant("Eli");
		zoo[7] = new animals.pachyderms.subs.Hippo("Hank");
		zoo[8] = new animals.marsupials.subs.Kangaroo("Kevin");
		zoo[9] = new animals.marsupials.subs.Wombat("Wanda");

		// IDENTITY : Here the Zookeeper object has a unique identity which we can
		// reference later on.
		employees.keepers.Zookeeper myZookeeper = new employees.keepers.Zookeeper("Mark");

		// Implements all the daily chores of the zooKeeper for each day.
		for (int i = 0; i < totalDays; i++){
			myZookeeper.dailyChores(zoo);
		}
	}	
}

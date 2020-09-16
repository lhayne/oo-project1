package employees.keepers;

import employees.ZooEmployee;
import animals.*;

public class Zookeeper extends ZooEmployee {

	public Zookeeper(String givenName) {
		name = givenName;
		type = "Zookeeper";
		day = 0;
	}
	public void arrive(){
		System.out.println(type + " " + name + " arrives on Day " + Integer.toString(day));
	}
	public void leave(){
		System.out.println(type + " " + name + " leaves on Day " + Integer.toString(day));
		day = day + 1;
	}
	public void wakeAnimals(Animal [] zoo){
		for (int i = 0; i < zoo.length; i++){
			System.out.println(type + " " + name + " wakes " + zoo[i].getFullTitle());
			zoo[i].wake();
		}
	}
	public void rollCallAnimals(Animal [] zoo){
		for (int i = 0; i < zoo.length; i++){
			System.out.println(type + " " + name + " calls out for " + zoo[i].getFullTitle());
			zoo[i].makeNoise();
		}
	}
	public void feedAnimals(Animal [] zoo){
		for (int i = 0; i < zoo.length; i++){
			System.out.println(type + " " + name + " feeds " + zoo[i].getFullTitle());
			zoo[i].eat();
		}
	}
	public void exerciseAnimals(Animal [] zoo){
		for (int i = 0; i < zoo.length; i++){
			System.out.println(type + " " + name + " exercises " + zoo[i].getFullTitle());
			zoo[i].roam();
		}
	}
	public void sleepAnimals(Animal [] zoo){
		for (int i = 0; i < zoo.length; i++){
			System.out.println(type + " " + name + " sleeps " + zoo[i].getFullTitle());
			zoo[i].sleep();
		}
	}
	public void dailyChores(Animal [] zoo){
		wakeAnimals(zoo);
		rollCallAnimals(zoo);
		feedAnimals(zoo);
		exerciseAnimals(zoo);
		sleepAnimals(zoo);
	}
}
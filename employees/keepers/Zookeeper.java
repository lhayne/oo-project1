import ZooEmployee;

public class Zookeeper extends ZooEmployee {

	public Zookeeper(String givenName) {
		super(givenName,"Zookeeper");
	}
	public void wakeAnimals(Animal zoo[]){
		for (int i = 0; i < zoo.size(); i++){
			System.out.println(type + " " + name + " wakes " + zoo[i].getFullTitle());
			zoo[i].wake();
		}
		
	}
	public void rollCallAnimals(Animal zoo[]){
		for (int i = 0; i < zoo.size(); i++){
			System.out.println(type + " " + name + " calls out for " + zoo[i].getFullTitle());
			zoo[i].makeNoise();
		}
	}
	public void feedAnimals(Animal zoo[]){
		for (int i = 0; i < zoo.size(); i++){
			System.out.println(type + " " + name + " feeds " + zoo[i].getFullTitle());
			zoo[i].eat();
		}
	}
	public void exerciseAnimals(Animal zoo[]){
		for (int i = 0; i < zoo.size(); i++){
			System.out.println(type + " " + name + " exercises " + zoo[i].getFullTitle());
			zoo[i].roam();
		}
	}
	public void sleepAnimals(Animal zoo[]){
		for (int i = 0; i < zoo.size(); i++){
			System.out.println(type + " " + name + " sleeps " + zoo[i].getFullTitle());
			zoo[i].sleep();
		}
	}
}
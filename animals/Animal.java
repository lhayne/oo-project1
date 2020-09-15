import java.util.*;

public class Animal {

	private String name;
	private String type;
		
	public Animal(String givenName,String givenType) {
		name = givenName;
		type = givenType;
	}
	public void wake() {
		System.out.println(name + " the " + type + " wakes up.");
	}
	public void makeNoise() {
		System.out.println(name + " the " + type + " makes noise.");
	}
	public void eat() {
		System.out.println(name + " the " + type + " eats.");
	}
	public void roam() {
		System.out.println(name + " the " + type + " roams.");
	}
	public void sleep() {
		System.out.println(name + " the " + type + " sleeps.");
	}
	public String getName() {
		return name;
	}
	public String getFullTitle() {
		return (name + " the " + type);
	}
}
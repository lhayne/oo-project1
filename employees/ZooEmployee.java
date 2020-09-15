public class ZooEmployee {

	private String name;
	private String type;
	private int day = 0;
		
	public ZooEmployee(String givenName, String givenType) {
		name = givenName;
		type = givenType;
	}
	public void arrive(){
		System.out.println(type + " " + name + " arrives on Day " + Integer.toString(day));
	}
	public void leave(){
		System.out.println(type + " " + name + " leaves on Day " + Integer.toString(day));
		day = day + 1;
	}
}
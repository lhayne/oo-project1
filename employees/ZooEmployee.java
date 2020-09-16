package employees;

// ABSTRACT CLASS : This class is declared abstract. It's methods are implemented
// in ZooKeeper.
public abstract class ZooEmployee {
	/*
	ZooEmployee class
	Attributes : name (String)
				 type (String)
				 day (int)
	methods : arrive : prints arrive message
			  leave : prints leaving message
	*/
	public String name;
	public String type;
	public int day = 0;
	
	public abstract void arrive();
	public abstract void leave();
}
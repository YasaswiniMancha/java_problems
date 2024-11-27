package concepts.constructor.Default;

public class User2 {

	 String name;
     int id;
     
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User2() {
       System.out.println("\nwith default constructor");
	}
	
	
	
}

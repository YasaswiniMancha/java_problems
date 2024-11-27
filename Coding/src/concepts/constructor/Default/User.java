package concepts.constructor.Default;

public class User {
	
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
	
	// If there is no constructor in a class, compiler automatically creates a default constructor.
     
}

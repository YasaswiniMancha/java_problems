package concepts.constructor.Parameterized;

public class User {

	String name;
	int id;

	public User(String name1, int id1) {
		name=name1;
		id=id1;
		System.out.println("with parameterized constructor");
	}

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

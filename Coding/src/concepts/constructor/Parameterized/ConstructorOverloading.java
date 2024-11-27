package concepts.constructor.Parameterized;

public class ConstructorOverloading {
	String name;
	int num;
	int score;
	boolean pass;

	public ConstructorOverloading() {

		System.out.println("Default constructor");
	}

	public ConstructorOverloading(String name, int num, int score, boolean pass) {

		this.name = name;
		this.num = num;
		this.score = score;
		this.pass = pass;

		System.out.println("\nConstructorOverloading [name=" + name + ", num=" + num + ", score=" + score + ", pass="
				+ pass + "]");
	}

	public ConstructorOverloading(String name, int num) {
		this.name = name;
		this.num = num;
		System.out.println("\nConstructorOverloading [name=" + name + ", num=" + num + "]");
	}

}

package concepts.staticKeyword;

public class UsageOfStaticKeyword {

	static int sum = 20; // static variable usage

	UsageOfStaticKeyword() {
		sum++;
		System.out.println(sum);
	}

	static void print() { // static method
		System.out.println("printed static method");
	}

	static int value;

	static { // static block
		value = 42; // Initialized when the class is loaded
		System.out.println("Static block executed");
	}

	static class InnerClass { // static inner class
		void show() {
			System.out.println("Inside static nested class");
		}
	}

	public static void main(String[] args) {

		new UsageOfStaticKeyword(); // instance created for static variable usage
		new UsageOfStaticKeyword(); // instance created for static variable usage again

		print(); // no need to create instance of the class for the usage of static methods

		System.out.println(UsageOfStaticKeyword.value);

		InnerClass inner = new InnerClass(); // No need for Outer instance
		inner.show();

	}

}

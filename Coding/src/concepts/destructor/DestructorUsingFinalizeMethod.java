package concepts.destructor;

public class DestructorUsingFinalizeMethod {

	public static void main(String args[]) {

		DestructorUsingFinalizeMethod d = new DestructorUsingFinalizeMethod();
		d.finalize();
		d = null;
		System.gc();
		System.out.println("Inside main method");
	}

	protected void finalize() {
		System.out.println("Object destroyed by finalize method");
	}

}

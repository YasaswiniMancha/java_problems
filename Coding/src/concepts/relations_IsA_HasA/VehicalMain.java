package concepts.relations_IsA_HasA;

public class VehicalMain {
	
	public static void main(String args[]) {

		Car car = new Car();
		
		car.engine.start();  // Has - a relationship

		car.drive();   
		
		car.stretchSeats();

		car.music();

		car.brake();

	}
}
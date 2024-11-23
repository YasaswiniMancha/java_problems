package concepts.relations_IsA_HasA;

public class Vehicle{
	
	 void drive() {
	        System.out.println("vehicle is driving.");    //vehice can be drive
	    }
	
	void brake() {
		System.out.println("brakes are applied");        //vehicle can apply brakes
	}
	
}

 class Car extends Vehicle{       //Car(child) Is-A vehicle , so directly inherited the properties of Vehicle(parent)
	 
	 Engine engine = new Engine();   // car Has-A  engine , so created an instance of engine in car
	
	
	 void music() {
		 System.out.println("playing music in car");    //only car has music option
	 }
	 
	 void stretchSeats() {
		 System.out.println("Stretching seats of car");  //only car has stretching seats option 
	 }
	 
}
 
 
//car Is-A vehicle
 //car Has-A engine

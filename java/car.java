package activities;

public class car {
	
	//initialize the variable
	public String color;
	public String transmission;
	public int make;
	public int tyres;
	public int doors;
	
	//constructor
	public car(){
		tyres = 5;
		doors = 4;
	}
	
	//method to display the characteristics
	public void displayCharacteristics() {
		System.out.println("Color of the car is: "+color);
		System.out.println("Transmission of the car is: "+transmission);
		System.out.println("Car make: "+make);
		System.out.println("Number of tyres in the car: "+ tyres);
		System.out.println("Number of doors in the car: "+ doors);
	}
	
	//method to display the accelerate
	public void accelerate() {
		System.out.println("Car is moving forward");
	}
	
	//method to display brake
	public void brake() {
		System.out.println("Car has stopped");
	}
	
	

}

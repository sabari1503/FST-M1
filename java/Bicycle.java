package activities;

public class Bicycle implements BicycleParts, BicycleOperations{
	
	public int gears;
	public int currentSpeed;
	
	public Bicycle(int gears, int currentSpeed){
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	
	public void applyBrake(int decrement) {
		currentSpeed =-decrement;
		System.out.println("Current Speed:"+currentSpeed);
	}
	
	public void speedUp(int increment) {
		gears =+increment;
		System.out.println("Current gear:"+gears);
		
	}
	
	public String bicycleDesc() {
		return("No of gears are "+gears+"\nSpeed of bicycle is "+currentSpeed);
	}

	
	}


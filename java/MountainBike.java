package activities;

public class MountainBike extends Bicycle {
	
	public int seatHeight;
	
	public MountainBike(int gears, int currentSpeed, int stHeight) {
		super(gears,currentSpeed);
		seatHeight = stHeight;
	}
	
	public void setHeight(int newvalue) {
		seatHeight = newvalue;
	}
	
	public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }

	

	
}

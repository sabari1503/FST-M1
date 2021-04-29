package activities;

import java.util.Date;

public class activity1 {
	
	public String date;
	
	public static void prntDate() {
		Date date = new Date();		
		System.out.println(date);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car Suzuki = new car();
		System.out.println("Activity 1: ");
		prntDate();
		System.out.println("***************************************************");
		Suzuki.color = "Red";
		Suzuki.transmission="Manual";
		Suzuki.make=2019;
		Suzuki.tyres = 4;
		Suzuki.doors = 2;
		Suzuki.displayCharacteristics();
		Suzuki.accelerate();
		Suzuki.brake();
	}

}

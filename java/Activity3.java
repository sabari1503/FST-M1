package activities;


import java.util.*;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner enterSec = new Scanner(System.in);
		System.out.println("Enter the secs to calculate the age:");
		double sec = enterSec.nextDouble();
//		System.out.println(sec);
		
		
		
		double earthSec = 31557600;
		double mercuSec = 0.2408467;
		
		System.out.println("The age on the earth is:"+ sec / earthSec);
		System.out.println("The age in the mercury is:"+ sec / earthSec / mercuSec);
	}

}

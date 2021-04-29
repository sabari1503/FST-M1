package activities;

public class Activity6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		plane pl = new plane(10);
		pl.onboard("Sabari");
		pl.onboard("Sanjay");
		pl.onboard("Yogith");
		System.out.println("The plane took of from the source place: "+pl.getLastTimeTakeof());
		System.out.println("Passengers in the plane:"+pl.getPassengers());
		Thread.sleep(5000);
		pl.land();
		System.out.println("Plane landed at: "+pl.getLastTimeLanded());
		System.out.println("People on the plane after landing: "+pl.getPassengers());
		
		
		
	}

}

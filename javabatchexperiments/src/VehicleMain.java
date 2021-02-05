
public class VehicleMain {

	public static void main(String args[]) {	
		Vehicle vehicle1=new Car();
		Vehicle vehicle2=new Bike();
		Vehicle vehicles[]=new Vehicle[2];
		vehicles[0]=vehicle1;
		vehicles[1]=vehicle2;
		for(int i=0;i<vehicles.length;i++) {
		vehicles[i].moves();
		}
		
	}
}

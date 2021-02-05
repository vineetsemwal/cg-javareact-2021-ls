
public class VehicleMain {

	public static void main(StringExperiment args[]) {
		Vehicle vehicle=new Car();
		vehicle.moves();
		int tyres=vehicle.getTyres();
		Car car=(Car)vehicle ;
		int windowsCount=car.getWindowsCount();
		
	}
}

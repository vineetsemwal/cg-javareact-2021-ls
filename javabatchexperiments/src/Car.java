
public  class Car extends Vehicle {
	private int windowsCount;

	@Override
	public void moves() {
		System.out.println("car moves");
	}
	
	public int getWindowsCount() {
		return windowsCount;
	}

	public void setWindowsCount(int windowsCount) {
		this.windowsCount = windowsCount;
	}

}

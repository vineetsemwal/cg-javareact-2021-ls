
public abstract class Vehicle  {
	private int tyres;

	abstract protected void moves();

	public int getTyres() {
		return tyres;
	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	
	
}

package hw9;

public class Bicycle implements CarbonFootprint
{
	public double gas;
	public String brand;
	
	public Bicycle(double gas, String brand) 
	{
		super();
		this.gas = gas;
		this.brand = brand;
	}

	public double getGas() {
		return gas;
	}

	public void setGas(double gas) {
		this.gas = gas;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCarbonFootprint()
	{
		return "Your carbon emmisions from your "+ brand +" are: " + gas* 8.887*.001 + "tons of CO2";
	}
}

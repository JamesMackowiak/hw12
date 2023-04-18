package hw9;

public class Car implements CarbonFootprint
{
	public String model;
	public double gas;
	
	
	public Car(double gas, String model)
	{
		super();
		this.model = model;
		this.gas = gas;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getGas() {
		return gas;
	}

	public void setGas(double gas) {
		this.gas = gas;
	}

	public String getCarbonFootprint()
	{
		return "Your carbon emmisions from your "+ model +" are: " + gas* 8.887*.001 + "tons of CO2";
	}
}

package hw9;

public class Building implements CarbonFootprint
{
	public double gas;
	public String company;
	
	public Building(double gas, String company) 
	{
		super();
		this.gas = gas;
		this.company = company;
		
	}


	public double getGas() {
		return gas;
	}


	public void setGas(double gas) {
		this.gas = gas;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getCarbonFootprint()
	{
		return "Your carbon emmisions from your "+ company +" are: " + gas* 8.887*.001 + "tons of CO2";
	}
}

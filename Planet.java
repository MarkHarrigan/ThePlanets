package testApp;

public abstract class Planet {

	private double mass, diameter, radiusKM;
	private String name;
	
	public String getName(){return name;}
	public void setName(String newName){name = newName;}
	public double getRadius(){return radiusKM;}
	public void setRadius(double r){radiusKM = r;}
	public double getMass(){return mass;}
	public void setMass(double m){mass = m;}
	public double getDiameter(){return diameter;}
	public void setDiameter(double d){diameter = d;}
	
	public void displayMass(){
		//createPlanets();
		System.out.println(getName() + " mass: " + getMass());
	}
	
	public void displayDiameter(){
		System.out.println(getName() + " diameter: " + getDiameter());
	}
	
	public void displayRadius(){
		System.out.println(getName() + " radius: " + getRadius());
	}

}

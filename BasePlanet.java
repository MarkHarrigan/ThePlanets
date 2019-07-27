package testApp;

public class BasePlanet {

	private double mass, diameter, radius;
	
	public BasePlanet(double m, double d){
		mass = m;
		diameter = d;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public void setRadius(double r){
		radius = r;
	}
	
	public double getMass(){
		return this.mass;
	}
	
	public void setMass(double m){
		mass = m;
	}
	
	public double getDiameter(){
		return this.diameter;
	}
	
	public void setDiameter(float d){
		diameter = d;
	}
		
	public void displayMass(){
		//createPlanets();
		System.out.println("Planet mass: " + this.getMass());
	}
	
	public void displayDiameter(){
		System.out.println("Planet diameter: " + this.getDiameter());
	}
	
	public void displayRadius(){
		System.out.println("Planet radius: " + this.getRadius());
	}
	
}

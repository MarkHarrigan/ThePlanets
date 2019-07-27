package testApp;


import java.math.BigDecimal;

import testApp.BasePlanet;
import testApp.Gravity;

	public class RunnablePlanets {

	BasePlanet b;
	
	public static void main(String args[]){
		
		/*BigDecimal test = new BigDecimal(438.0);
		test = test.add(new BigDecimal(0.0000000000001));
		System.out.println("BigDecimal test: " + test.toString());*/
		
		
		
		BasePlanet c = new BasePlanet(10.0f, 10.0f);
		Gravity g = new Gravity();
		c.displayMass();
		g.displayGravityConstant();
		
	}
}

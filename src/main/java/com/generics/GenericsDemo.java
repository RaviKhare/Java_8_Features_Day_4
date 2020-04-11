package main.java.com.generics;

import main.java.com.model.Blue;
import main.java.com.model.Green;
import main.java.com.model.Juice;
import main.java.com.model.Red;
import main.java.com.model.Water;

public class GenericsDemo {

	public static void main(String[] args) {
	
		Glass<Juice> juiceGlass = new Glass<Juice>();
		Juice juice = new Juice();
		juiceGlass.liquid = juice;
		
		
		// retrieve
		Juice j = juiceGlass.liquid;
		
		Glass<Water> waterGlass = new Glass<Water>();
		Water water = new Water();
		waterGlass.liquid = water;
		
		// retrieve
		Water w= waterGlass.liquid;
		
		Color<Red, Green, Blue> color = new Color<Red, Green, Blue>();
		
		Bartender bartender = new Bartender();
		bartender.mix(j, w);
	}

}

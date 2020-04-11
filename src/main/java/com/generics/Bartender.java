/**
 * 
 */
package main.java.com.generics;

import main.java.com.model.Juice;
import main.java.com.model.Water;

/**
 * @author rk25
 *
 */
public class Bartender {
	
	public<J,W> void mix (Juice j, Water w){
		
		System.out.println("mix");
	}
	

}

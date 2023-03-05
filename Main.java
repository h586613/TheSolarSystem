package planets1;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;



public class Main {

	public static void main(String[] args) {
		
//		SolarSystem theSolarSystem = new SolarSystem(9);
//		
//		theSolarSystem.start();
		
		
		JFrame frame = new JFrame("The Solar System"); //new window
	        
		//new centerobject (star) here
			Star theSun = new Star(new Coordinate(400,400), "The Sun", 30, Color.YELLOW);
			
			
		
			
		// new planets here (name, size, color, centerObject, distanceFromCenter, angle, frequency, period
			Planet earth = new Planet("Earth", 15, Color.BLUE.brighter(), theSun, 40, 0, 15, 0);
			Moon theMoon = new Moon("The Moon", 7, Color.GRAY, earth, 15, 0, 8, 0);
			
			Planet mars = new Planet("Mars", 15, Color.RED, theSun, 85, 0, 19, 0);
			Moon deimos = new Moon("Deimos", 7, Color.GRAY, mars, 14, 0, 7, 0);
			Moon phobos = new Moon("Phobos", 7, Color.GREEN, mars, 22, 0, 6, 0);
			
			Planet neptun = new Planet("Neptun", 12, Color.BLUE, theSun, 120, 0, 20, 0);
			
			Planet venus = new Planet("Venus", 15, Color.pink, theSun, 150, 0, 15, 0);
			
			
			//collection of orbital objects to pass to animation
			OrbitalObject[] ol = new OrbitalObject[]{earth, theMoon, mars, deimos, phobos, neptun, venus};
			
			
			
			
			AnimPanel ap = new AnimPanel(ol, theSun); //restraint: only one center object; only one solar system per panel
													//but we can have more panels per window so then its ok ig
	        ap.setPreferredSize(new Dimension(800, 800));
	        ap.setOpaque(true);
	       
	        ap.setBackground(Color.BLACK);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //before this was added, application did not terminate on frame close
	        frame.add(ap);
	        frame.pack();
	        frame.setVisible(true);
		
		

		
	        ap.startAnimation();
		
		
	
	}

}

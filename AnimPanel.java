package planets1;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	
	OrbitalObject[] ol;
	CenterObject co;
	
	public AnimPanel(OrbitalObject[] ol, CenterObject co) {
		this.ol = ol;
		this.co = co;
	}
	

	public void startAnimation() {
		
		
		for(OrbitalObject o: ol) {
		
			// new timer that ticks every Xms; angle changes
			Timer timer = new Timer(o.getFrequency(), e -> {

				o.incAngle();

				if (o.getAngle() == 360) {
					o.setAngle(0);
				}

				repaint(); // calls paint again to update whole panel
			});

			timer.start();
			
			
			}
		
	

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d2 = (Graphics2D) g;
		
		g2d2.setColor(co.getColor());
		g2d2.fillOval(co.getCoordinate().getX() - co.getSize() / 2, co.getCoordinate().getY() - co.getSize() / 2, co.getSize(), co.getSize());	
//		g2d2.setColor(Color.BLACK);
//		g2d2.drawOval(co.getCoordinate().getX() - co.getSize() / 2, co.getCoordinate().getY() - co.getSize() / 2, co.getSize(), co.getSize());		

		
		for(OrbitalObject o: ol) {
			Graphics2D g2d = (Graphics2D) g;
	
			g2d.setColor(o.getColor());
			o.setCoordinateRelativeToCenterObject();
			g2d.fillOval(o.getCoordinate().getX() - o.getSize() / 2, o.getCoordinate().getY() - o.getSize() / 2, o.getSize(), o.getSize());
			if(o.getClass().toString().equals("class planets1.Planet")) {
				g2d.drawOval(o.getCenterObject().getCoordinate().getX() - 2*o.getDistanceFromCenter() / 2, o.getCenterObject().getCoordinate().getY() - 2*o.getDistanceFromCenter() / 2, 2*o.getDistanceFromCenter(), 2*o.getDistanceFromCenter());
	
			}
			
		}

		
		
		
	}
}

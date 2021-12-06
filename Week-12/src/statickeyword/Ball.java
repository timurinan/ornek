package statickeyword;

import java.awt.Color;

public class Ball {
	
	Color color;
	double radius;
	static int amount=0;
	
	
	public Ball(Color color, double radius) {
		amount++;
		this.color = color;
		this.radius = radius;
	}
	
	
	
	

}

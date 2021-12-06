package statickeyword;

import java.awt.*;

public class Application1 {

	public static void main(String[] args) {
		
		Ball ball1=new Ball(Color.red, 20);
		
		Ball ball2=new Ball(Color.yellow,30);
		
		Ball ball3=new Ball(Color.black, 25);
		
		System.out.println("The amount of the balls that are created:"+Ball.amount);
		
		Ball[]balls={ball1,ball2,ball3};
		
		//writeObjectProperties(balls);
		
		//We can not call non-static methods from static methods.
		
		writeObjectProperties(balls);
		
		//we can call static methods from non-static methods.

	}
	
	public static void writeObjectProperties(Ball[]balls) {
		
		for (int i = 0; i < balls.length; i++) {
			System.out.println("The color of the "+ (i+1)+ "ball's color:"+balls[i].color);
			
			System.out.println("The color of the "+ (i+1)+ "ball's radius:"+balls[i].radius);
		}
	}
	
	public void call() {
		main(null);
	}
}

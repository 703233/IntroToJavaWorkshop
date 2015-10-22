package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	private static final String Color = null;

	public static void main(String[] args) {
		
		// START HERE
		Robot Dragon = new Robot("batman");
		Dragon.penDown();
		Dragon.setSpeed(10);
		Dragon.setPenColor(0, 0, 255);
		
		for (int i = 0; i < 400; i++) {
			
			Dragon.move(200);
			Dragon.turn(90);
			Dragon.turn(1);
			
		}
	
		
		/*Dragon.move(200);
		Dragon.turn( 90);
		
		Dragon.move(200);
		Dragon.turn( 90);
		
		Dragon.move(200);
		Dragon.turn( 90);
		
		Dragon.move(200);
		Dragon.turn( 90);*/
		
		/*Dragon.move(400);
		Dragon.turn(500);
		Dragon.move(780);
		Dragon.turn(540);
		Dragon.sparkle();
		Dragon.move(234);
		Dragon.turn(654);
		Dragon.move(456);
		Dragon.turn(860);
		Dragon.sparkle();

		Dragon.move(860);
		Dragon.turn(500);
		Dragon.move(780);
		Dragon.turn(540);
		Dragon.sparkle();
		Dragon.move(234);
		Dragon.turn(654);
		Dragon.move(456);
		Dragon.turn(860);
		Dragon.sparkle();*/
	}
}

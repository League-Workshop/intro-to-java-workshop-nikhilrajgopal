package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot nik = new Robot();
	nik.setSpeed(500);
	nik.penDown();
    nik.move(300);
	nik.turn(180);
	nik.move(600);
	
	}
}

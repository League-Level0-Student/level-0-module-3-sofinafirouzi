

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot batman = new Robot();
public static void main(String[] args) {
	
	
batman.penDown();   
batman.setSpeed(10000000);

String answer =	JOptionPane.showInputDialog("What shape do you want?");
if(answer.equals( "circle")) {
	drawCircle();
}
if(answer.equals("square") ) {
	drawSquare();
}
if(answer.equals("triangle")) {
	drawTriangle();
}
}

static void drawSquare(){
	
for(int i=0; i<5; i++) {

batman.move(200);
batman.turn(90);
}

}

static void drawTriangle(){
	
	for(int i=0; i<3; i++) {
		batman.move(200);
		batman.turn(120);
	}
	
}

static void drawCircle(){
	
	for(int i=0; i<3700; i++) {
	batman.move(5);
	batman.turn(2);
	}
	
}
	

	
	
	
	
}


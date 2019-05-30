package _04_are_you_happy;

import javax.swing.JOptionPane;

public class areYouHappy {
public static void main(String[] args) {
	
	String question1 = JOptionPane.showInputDialog("Are you happy?");
	if(question1.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
	} 
	else if(question1.equalsIgnoreCase("No")) {
		String question2 = JOptionPane.showInputDialog("Do you want to be happy?");
		 if(question2.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}
		 if(question2.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
		}
			
	}
	
}


 }

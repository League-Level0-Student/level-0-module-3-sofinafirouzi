package _05_horoscope;
import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	String star = JOptionPane.showInputDialog("Enter your star sign");
	if(star.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "An excess of energy could cause you to fly off the handle once or twice today, but no one will be offended by your passion. You have a vision of what you want the next year of your life to be. Go out and get it started today.");

	} 
	if(star.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "Not everything is going to go your way today—but the things that need to happen are going to happen, so take some comfort in that.");

	}
	else if(star.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "On this busy day, it might feel like an insurmountable challenge to focus on creative endeavors, but it would be in your best career interests to do just that. ");
	}
	else if(star.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "The idea of newness is going to be very exciting for you today, and your exploration of the unknown will give you all the newness your crave.");
	
	}
	else if(star.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null, "Big news is coming to your group soon, and while all the others may react emotionally, you don't need to fly off the handle.");
	
	}
	else if(star.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null, "Some important deadlines are looming, but don't try to meet them early by finishing up everything today. ");
	
	}
	else if(star.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "Your emotional vision is a perfect 20/20 today. You will finally see things in a clear, honest way. ");
	
	}
	else if(star.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, "An unexpected outburst from a friend could catch you off guard today—they clearly have a problem with you that they need to address!");
	
	}
	else if(star.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "Today, your mental powers may be sharp, but your wit is even sharper! ");
	
	}
	else if(star.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, "Your finances are getting to be a bigger issue in your life right now, and preservation of your bank account should be a high priority starting today.");
	
	}
	else if(star.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Get ready for some unexpected excitement to hit you today. ");
	
	}
	else if(star.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, " Even holding a lantern out in front of you won't help you see better right now -- it'll illuminate the fog and make the glare brighter. ");
	
	}
	else {
		JOptionPane.showMessageDialog(null, "That's not a star sign!");
	}
	
	
	
	
	
	
}
}

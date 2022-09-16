import javax.swing.JOptionPane;
public class SuperPowers {
	public static void main(String[] arg) {
		String power = JOptionPane.showInputDialog("What is your super power?");
		power = power.toUpperCase();
		JOptionPane.showMessageDialog(null,power + " TO THE RESCUE!");
	}
	

}

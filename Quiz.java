import javax.swing.JOptionPane;
public class Quiz{
	public static void main(String[] arg) {
		String mainQuestion = "What is the airspeed of an unladen swallow?\n";
		mainQuestion += "A: 1000mph\n";
		mainQuestion += "B: African or a European swallow?\n";
		mainQuestion += "C: A Swallow doesn't exist\n";
		mainQuestion += "D: Null\n";
		mainQuestion += "E: This is Java, not some playground for cheap parlor tricks\n";
		
		String correct = "B";
		String wrong = "A,C,D,E";
		
		while (true) {
			String answer = JOptionPane.showInputDialog(mainQuestion);
			answer = answer.toUpperCase();
			if (answer.equals(correct)) {
				JOptionPane.showMessageDialog(null,"Good job! You picked the correct answer: " + answer);
				break;
			} else if (wrong.contains(answer)) {
				JOptionPane.showMessageDialog(null, answer + " is wrong, try again");
				
			} else {
				JOptionPane.showMessageDialog(null, "Invalid. Please enter A, B, C, D, or E");
				
			}
				
		}
			
	}
	
}
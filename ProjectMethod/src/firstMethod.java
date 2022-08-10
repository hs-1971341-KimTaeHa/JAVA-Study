import javax.swing.JOptionPane;

public class firstMethod {
	public static void printTwoTimesA(String text, String delimiter) {
		
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		String text = JOptionPane.showInputDialog("");
		String delimiter = JOptionPane.showInputDialog("");
		printTwoTimesA(text, delimiter);
		printTwoTimesA(text, delimiter);
		printTwoTimesA(text, delimiter);

	}

}

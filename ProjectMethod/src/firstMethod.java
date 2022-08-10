import javax.swing.JOptionPane;

public class firstMethod {
	public static String twoTimesA(String text, String delimiter) {
		
		String out = "";
		out += delimiter + "\n";
		out += text + "\n";
		out += text + "\n";
		return out;
	}
	
	public static void main(String[] args) {
		String text = JOptionPane.showInputDialog("");
		String delimiter = JOptionPane.showInputDialog("");
		
		System.out.println(twoTimesA(text, delimiter));

	}

}

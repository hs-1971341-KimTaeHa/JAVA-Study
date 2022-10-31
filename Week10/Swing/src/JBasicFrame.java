import javax.swing.JFrame;

public class JBasicFrame {
	private JFrame frame;
	
	public JBasicFrame() {
		frame = new JFrame();
		frame.setTitle("Frame1");
		frame.setSize(200, 300);
		//frame.setLocation(100, 200);
		frame.setBounds(100, 200, 200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

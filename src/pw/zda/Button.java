package pw.zda;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Button extends JButton {

	
	public Button(int x, int y, int width, int height, String name, JFrame frame)
	{
	super(name);	
	setBounds(x, y, width, height);
	setFont(new Font("Arial", Font.BOLD, 20));
	}
	
}

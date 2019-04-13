package pw.zda;

import java.awt.ComponentOrientation;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField extends JTextField {
	
	public TextField(int x, int y, int width, int height, String name, JFrame frame)
	{
		super();	
		setBounds(x, y, width, height);
		setFont(new Font("Arial", Font.BOLD, 20));	
		setEditable(false);
		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	}

}

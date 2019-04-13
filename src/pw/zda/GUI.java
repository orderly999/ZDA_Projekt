package pw.zda;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame {

	
	int button_width = 75;
	int button_height = 75;
	int button_x = 30;
	int button_y = 30;
	
			
	Button buttton_0 = new Button(button_x*6, button_y*14, button_width, button_height, "0", this);
	Button buttton_1 = new Button(button_x*3, button_y*5, button_width, button_height, "1", this);
	Button buttton_2 = new Button(button_x*6, button_y*5, button_width, button_height, "2", this);
	Button buttton_3 = new Button(button_x*9, button_y*5, button_width, button_height, "3", this);
	Button buttton_4 = new Button(button_x*3, button_y*8, button_width, button_height, "4", this); 
	Button buttton_5 = new Button(button_x*6, button_y*8, button_width, button_height, "5", this);
	Button buttton_6 = new Button(button_x*9, button_y*8, button_width, button_height, "6", this);
	Button buttton_7 = new Button(button_x*3, button_y*11, button_width, button_height, "7", this);
	Button buttton_8 = new Button(button_x*6, button_y*11, button_width, button_height, "8", this);
	Button buttton_9 = new Button(button_x*9, button_y*11, button_width, button_height, "9", this);
	
	Button buttton_add = new Button(button_x, button_y, button_width, button_height, "+", this);
	Button buttton_subtract = new Button(button_x, button_y, button_width, button_height, "-", this);
	Button buttton_multi = new Button(button_x, button_y, button_width, button_height, "*", this);
	Button buttton_divide = new Button(button_x, button_y, button_width, button_height, "/", this);
	Button buttton_exec = new Button(button_x*9, button_y*10, button_width, button_height, "exe", this);
	
	public GUI()
	{
		   setSize(500, 600);
		   setLocation(100, 150);
		   //make sure it quits when x is clicked
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   //set look and feel
		   setDefaultLookAndFeelDecorated(true);
		   JLabel labelM = new JLabel("Not Only of Sight, but of: ");
		   labelM.setBounds(50, 50, 200, 30);
		   JTextField motto1 = new JTextField();
		   //set size of the text box
		   motto1.setBounds(50, 100, 200, 30);
		   //add elements to the frame
		   
		   
		   addElements();
		   setLayout(null);
		   setVisible(true);
		
	}
	
	
	public void addElements()
	{
		add(buttton_0);
		add(buttton_1);
		add(buttton_2);
		add(buttton_3);
		add(buttton_4);
		add(buttton_5);
		add(buttton_6);
		add(buttton_7);
		add(buttton_8);
		add(buttton_9);
		
		add(buttton_add);
		add(buttton_subtract);
		add(buttton_multi);
		add(buttton_divide);
		add(buttton_exec);	
	}
	
	
	
	
}

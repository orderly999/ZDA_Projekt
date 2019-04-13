package pw.zda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame {

	
	public String displayedValue = new String("0");
	public String displayedValue2 = new String("0");
	public String lastClicked = new String("0");
	
	int button_width = 75;
	int button_height = 75;
	int button_x = 30;
	int button_y = 30;
	
			
	Button button_0 = new Button(button_x*6, button_y*14, button_width, button_height, "0", this);
	Button button_1 = new Button(button_x*3, button_y*5, button_width, button_height, "1", this);
	Button button_2 = new Button(button_x*6, button_y*5, button_width, button_height, "2", this);
	Button button_3 = new Button(button_x*9, button_y*5, button_width, button_height, "3", this);
	Button button_4 = new Button(button_x*3, button_y*8, button_width, button_height, "4", this); 
	Button button_5 = new Button(button_x*6, button_y*8, button_width, button_height, "5", this);
	Button button_6 = new Button(button_x*9, button_y*8, button_width, button_height, "6", this);
	Button button_7 = new Button(button_x*3, button_y*11, button_width, button_height, "7", this);
	Button button_8 = new Button(button_x*6, button_y*11, button_width, button_height, "8", this);
	Button button_9 = new Button(button_x*9, button_y*11, button_width, button_height, "9", this);
	
	Button button_add = new Button(button_x*12, button_y*5, button_width, button_height, "+", this);
	Button button_subtract = new Button(button_x*12, button_y*8, button_width, button_height, "-", this);
	Button button_multi = new Button(button_x*12, button_y*11, button_width, button_height, "*", this);
	Button button_divide = new Button(button_x*12, button_y*14, button_width, button_height, "/", this);
	Button button_exec = new Button(button_x*9, button_y*14, button_width, button_height, "exe", this);
	Button button_comma = new Button(button_x*3, button_y*14, button_width, button_height, ",", this);
	
	TextField textField = new TextField(button_x*3, button_y, 350, button_height, "", this);
	
	Button button_clr = new Button(button_x*3, button_y*17, 350, button_height, "clr", this);
	
	public GUI()
	{
		   setSize(530, 650);
		   setLocation(100, 150);
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setDefaultLookAndFeelDecorated(true);

		   
		   setTitle("Kalkulator ZDA PW v4.2019");
		   addElements();
		   addListeners();
		   setLayout(null);
		   setVisible(true);
		
	}
	
	
	public void addElements()
	{
		add(button_0);
		add(button_1);
		add(button_2);
		add(button_3);
		add(button_4);
		add(button_5);
		add(button_6);
		add(button_7);
		add(button_8);
		add(button_9);
		
		add(button_add);
		add(button_subtract);
		add(button_multi);
		add(button_divide);
		add(button_exec);	
		add(button_comma); 
		add(textField);
		add(button_clr);
	}
	
	public void addListeners()
	{
		
		ButtonAny_listener buttonAny_listener = new ButtonAny_listener();
		
		button_0.addActionListener(buttonAny_listener);
		button_1.addActionListener(buttonAny_listener);
		button_2.addActionListener(buttonAny_listener);
		button_3.addActionListener(buttonAny_listener); 
		button_4.addActionListener(buttonAny_listener);  
		button_5.addActionListener(buttonAny_listener); 
		button_6.addActionListener(buttonAny_listener); 
		button_7.addActionListener(buttonAny_listener); 
		button_8.addActionListener(buttonAny_listener); 
		button_9.addActionListener(buttonAny_listener); 
		
		button_add.addActionListener(buttonAny_listener); 
		button_subtract.addActionListener(buttonAny_listener); 
		button_multi.addActionListener(buttonAny_listener); 
		button_divide.addActionListener(buttonAny_listener); 
		button_exec.addActionListener(buttonAny_listener);
		button_comma.addActionListener(buttonAny_listener);
		
		
		
		Button0_listener Button0_listener = new Button0_listener();
		button_0.addActionListener(Button0_listener);
		
		Button1_listener Button1_listener = new Button1_listener();
		button_1.addActionListener(Button1_listener);
		
		Button2_listener Button2_listener = new Button2_listener();
		button_2.addActionListener(Button2_listener);
		
		Button3_listener Button3_listener = new Button3_listener();
		button_3.addActionListener(Button3_listener);
		
		Button4_listener Button4_listener = new Button4_listener();
		button_4.addActionListener(Button4_listener);
		
		Button5_listener Button5_listener = new Button5_listener();
		button_5.addActionListener(Button5_listener);
		
		Button6_listener Button6_listener = new Button6_listener();
		button_6.addActionListener(Button6_listener);
		
		Button7_listener Button7_listener = new Button7_listener();
		button_7.addActionListener(Button7_listener);
		
		Button8_listener Button8_listener = new Button8_listener();
		button_8.addActionListener(Button8_listener);
		
		Button9_listener Button9_listener = new Button9_listener();
		button_9.addActionListener(Button9_listener);
		
		
		
		ButtonClr_listener buttonClr_listener  = new ButtonClr_listener();
		button_clr.addActionListener(buttonClr_listener);
		
		ButtonAdd_listener buttonAdd_listener  = new ButtonAdd_listener();
		button_add.addActionListener(buttonAdd_listener); 
		
		ButtonSub_listener buttonSub_listener  = new ButtonSub_listener();
		button_subtract.addActionListener(buttonSub_listener); 
		
		ButtonMul_listener buttonMul_listener  = new ButtonMul_listener();
		button_multi.addActionListener(buttonMul_listener); 
		
		ButtonDiv_listener buttonDiv_listener  = new ButtonDiv_listener();
		button_divide.addActionListener(buttonDiv_listener);
		
		ButtonExec_listener buttonExec_listener  = new ButtonExec_listener();
		button_exec.addActionListener(buttonExec_listener);
		
		ButtonClr_listener buttonComma_listener  = new ButtonClr_listener();
		button_comma.addActionListener(buttonComma_listener);

		textField.setText("0");
	}
	
	
	class Button0_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (displayedValue.equals("0"))
			displayedValue = "";	
			displayedValue = displayedValue.concat("0");
		}
	    }
	
	
	class Button1_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (displayedValue.equals("0"))
				displayedValue = "";
			displayedValue = displayedValue.concat("1");
			
		}
	    }
	
	class Button2_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (displayedValue.equals("0"))
				displayedValue = "";
			displayedValue = displayedValue.concat("2");
			
		}
	    }
	
	class Button3_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (displayedValue.equals("0"))
				displayedValue = "";
			displayedValue = displayedValue.concat("3");
			
		}
	    }
	
	class Button4_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (displayedValue.equals("0"))
				displayedValue = "";
			displayedValue = displayedValue.concat("4");
			
		}
	    }
	
	class Button5_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (displayedValue.equals("0"))
				displayedValue = "";
			displayedValue = displayedValue.concat("5");
			
		}
	    }
	
	class Button6_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (displayedValue.equals("0"))
				displayedValue = "";
			displayedValue = displayedValue.concat("6");
			
		}
	    }
	
	
	class Button7_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (displayedValue.equals("0"))
				displayedValue = "";
			displayedValue = displayedValue.concat("7");
			
		}
	    }
	
	class Button8_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (displayedValue.equals("0"))
				displayedValue = "";
			displayedValue = displayedValue.concat("8");
			
		}
	    }
	
	
	class Button9_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (displayedValue.equals("0"))
				displayedValue = "";
			displayedValue = displayedValue.concat("9");
			
		}
	    }
	
	class ButtonAny_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			textField.setText(displayedValue);
			
		}
	    }
	
	class ButtonClr_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			textField.setText("0");
			displayedValue = "0";
		}
	    }
	
	
	class ButtonAdd_listener implements ActionListener {
     
		@Override
		public void actionPerformed(ActionEvent arg0) {
		lastClicked = new String(textField.getText());	
//		displayedValue2 = new String(displayedValue);		
//		int result = Integer.valueOf(displayedValue) + Integer.valueOf(displayedValue2);
//		//displayedValue = new String(displayedValue2);
//		displayedValue2 = String.valueOf(result);
//		textField.setText("displayedValue2");
		}
	    }
	
	class ButtonSub_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			lastClicked = new String(textField.getText());
		}
	    }
	
	class ButtonDiv_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			lastClicked = new String(textField.getText());	
		}
	    }
	
	class ButtonMul_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			lastClicked = new String(textField.getText());
//			displayedValue2 = new String(displayedValue);	
//			int result = Integer.valueOf(displayedValue) * Integer.valueOf(displayedValue2);
//			//displayedValue = new String(displayedValue2);
//			displayedValue2 = String.valueOf(result);		
//			textField.setText("displayedValue2");
		}
	    }
	
	class ButtonExec_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			
		}
	    }
	
	class ButtonComma_listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			
		}
	    }
	
}

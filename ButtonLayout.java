package hw9;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonLayout extends JFrame
{
	JButton b1=new JButton("Car");
	JButton	 b2=new JButton("Building");
	JButton	 b3=new JButton("Bike");
	
	public ButtonLayout() 
	{
		setTitle("ButtonLayout");
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		setBounds(0,0,400,100);
		 pane.add(b1); 
		 pane.add(b2); 
		 pane.add(b3);
	}
}

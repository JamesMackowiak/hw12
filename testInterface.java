package hw9;
//This class will test the building, car, and bicycle classes with the carbonfootprint interface
//James Mackowiak

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class testInterface {

	public static void main(String[] args) 
	{
		ArrayList<Object> CarbonFootprint = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		String temp1 = JOptionPane.showInputDialog("What is the gallons of gas uses for your car? ");
		double gas1 = Integer.parseInt(temp1);
		
		String model = JOptionPane.showInputDialog("What is the model of the car? ");
		String temp2 = JOptionPane.showInputDialog("What is the gallons of gas uses for your building? ");
		double gas2 = Integer.parseInt(temp2);
		
		String company = JOptionPane.showInputDialog("What is the Name of the comapny? ");
		
		String temp3 = JOptionPane.showInputDialog("What is the gallons of gas uses for your bycycle? ");
		double gas3 = Integer.parseInt(temp3);
		String brand = JOptionPane.showInputDialog("What is the brand of the motorcycle? ");
		Car cr = new Car(gas1, model);
		Building bl = new Building(gas2, company);
		Bicycle by = new Bicycle(gas3, brand);
		
		
		JFrame test = new ButtonLayout();
		 test.setVisible(true);
		
		CarbonFootprint.add(cr);
		CarbonFootprint.add(bl);
		CarbonFootprint.add(by);
		
		JOptionPane.showMessageDialog(null ,cr.getCarbonFootprint() + "\n" + bl.getCarbonFootprint() + "\n" + by.getCarbonFootprint());

		
	}

}

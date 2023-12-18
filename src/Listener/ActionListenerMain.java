package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import AppointmentElements.AppointmentFrame;
import CustomerElements.CustomerFrame;
import GarageElements.GarageFrame;
import MainComponents.MainInterface;
import WarehouseElements.WarehouseFrame;

public class ActionListenerMain implements ActionListener {
	private MainInterface frame;
	private CustomerFrame customerFrame;
	
	public ActionListenerMain(MainInterface frame, CustomerFrame customerFrame) {
		this.frame = frame;
		this.customerFrame = customerFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonID = ((JButton) e.getSource()).getActionCommand();
		
		//Main Button
		if ("Kunden".equals(buttonID)) {
            new CustomerFrame(buttonID); 
            frame.dispose();
            
        } else if ("Werkstatt".equals(buttonID)) {
        	new GarageFrame(buttonID);
        	frame.dispose();
        	 
        } else if ("Lager".equals(buttonID)) {
        	new WarehouseFrame(buttonID);
        	frame.dispose();
        	 
        } else if ("Termine".equals(buttonID)) {
        	new AppointmentFrame(buttonID);
        	frame.dispose();
        	 
        } else if ("Mitarbeiter".equals(buttonID)) {
        	 System.out.println(buttonID);
        	 
        } else if ("Zeiterfassung".equals(buttonID)) {
        	 System.out.println(buttonID);
        	 
        } 
		
		//Customer button
		if("Kunde hinzufügen".equals(buttonID)) {
        	System.out.println(buttonID);
        	
        } else if("Kunde suchen".equals(buttonID)) {
        	System.out.println(buttonID);
        	
        } else if("Kunde löschen".equals(buttonID)) {
        	System.out.println(buttonID);
        	
        } else if("Kundendaten".equals(buttonID)) {
        	System.out.println(buttonID);
        	
        }
		
		
	}
	
	
}
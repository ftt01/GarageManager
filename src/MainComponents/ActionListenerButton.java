package MainComponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import AppointmentElements.AppointmentFrame;
import CustomerElements.CustomerFrame;
import GarageElements.GarageFrame;
import WarehouseElements.WarehouseFrame;

public class ActionListenerButton implements ActionListener {
	private MainInterface frame;
	private CustomerFrame customerFrame;
	
	public ActionListenerButton(MainInterface frame, CustomerFrame customerFrame) {
		this.frame = frame;
		this.customerFrame = customerFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonID = ((JButton) e.getSource()).getActionCommand();

		if ("Kunden".equals(buttonID)) {
            new CustomerFrame(buttonID);     
            
        } else if ("Werkstatt".equals(buttonID)) {
        	new GarageFrame(buttonID);
        	 
        } else if ("Lager".equals(buttonID)) {
        	new WarehouseFrame(buttonID);
        	 
        } else if ("Termine".equals(buttonID)) {
        	new AppointmentFrame(buttonID);
        	 
        } else if ("Mitarbeiter".equals(buttonID)) {
        	 System.out.println(buttonID);
        	 
        } else if ("Zeiterfassung".equals(buttonID)) {
        	 System.out.println(buttonID);
        	 
        } else if("Kunde hinzufügen".equals(buttonID)) {
        	System.out.println(buttonID);
        	
        } else if("Kunde suchen".equals(buttonID)) {
        	System.out.println(buttonID);
        	
        } else if("Kunde löschen".equals(buttonID)) {
        	System.out.println(buttonID);
        	
        } else if("KKundendaten".equals(buttonID)) {
        	System.out.println(buttonID);
        	
        }
		frame.dispose();
	}
}
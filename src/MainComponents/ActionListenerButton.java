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
	protected String[] buttonName = { "Kunden", "Werkstatt", "Lager", "Termine", "Mitarbeiter", "Zeiterfassung" };
	
	public ActionListenerButton(MainInterface frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonID = ((JButton) e.getSource()).getActionCommand();

		if ("Kunden".equals(buttonID)) {
            CustomerFrame customer = new CustomerFrame(buttonID);
            
            
        } else if ("Werkstatt".equals(buttonID)) {
        	GarageFrame garage = new GarageFrame(buttonID);
        	
        	 
        } else if ("Lager".equals(buttonID)) {
        	WarehouseFrame warehouse = new WarehouseFrame(buttonID);
        	 
        } else if ("Termine".equals(buttonID)) {
        	AppointmentFrame appointment = new AppointmentFrame(buttonID);
        	 
        } else if ("Mitarbeiter".equals(buttonID)) {
        	 System.out.println(buttonID);
        	 
        } else if ("Zeiterfassung".equals(buttonID)) {
        	 System.out.println(buttonID);
        	 
        }
		frame.dispose();
	}
}
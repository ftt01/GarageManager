package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import MainComponents.MainInterface;


public class ActionListenerMain implements ActionListener {
	private MainInterface frame;

	
	public ActionListenerMain(MainInterface frame) {
		this.frame = frame;

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonID = ((JButton) e.getSource()).getActionCommand();
		
		//Main button
		if ("Kunden".equals(buttonID)) {
			
            
        } else if ("Werkstatt".equals(buttonID)) {

        	
        	 
        } else if ("Lager".equals(buttonID)) {
        	
        	 
        } else if ("Termine".equals(buttonID)) {
        	
        	 
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
		

		//Garage button
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
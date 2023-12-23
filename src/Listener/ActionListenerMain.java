package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import AppointmentElements.AppointmentFrame;
import CustomerElements.MainCustomerFrame;
import CustomerElements.CustomerIDQuery;
import CustomerElements.ChangeCustomer;
import CustomerElements.CreateCustomerFrame;
import CustomerElements.CustomerDeleteIDFrame;
import Database.SearchDatabaseContent;
import EmployeElements.EmployeFrame;
import GarageElements.GarageFrame;
import MainComponents.MainInterface;
import WarehouseElements.WarehouseFrame;

public class ActionListenerMain implements ActionListener {
	private MainInterface frame;
	private MainCustomerFrame mainCustomerFrame;
	private GarageFrame garageFrame;
	private SearchDatabaseContent searchDatabase;
	private EmployeFrame employeFrame;
	private CustomerDeleteIDFrame deleteFrame;

	public ActionListenerMain(MainInterface frame, MainCustomerFrame mainCustomerFrame, GarageFrame garageFrame,
			SearchDatabaseContent searchDatabase, EmployeFrame employeFrame) {
		this.frame = frame;
		this.mainCustomerFrame = mainCustomerFrame;
		this.garageFrame = garageFrame;
		this.searchDatabase = searchDatabase;
		this.employeFrame = employeFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonID = ((JButton) e.getSource()).getActionCommand();

		// Main Button
		if ("Kunden".equals(buttonID)) {
			new MainCustomerFrame(buttonID);
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
			new EmployeFrame(buttonID);
			frame.dispose();

		} else if ("Zeiterfassung".equals(buttonID)) {
			System.out.println(buttonID);

		}

		// Customer button
		if ("Kunde hinzufügen".equals(buttonID)) {
			new CreateCustomerFrame();

		} else if ("Kunde suchen".equals(buttonID)) {
			searchDatabase.setTextInList(1);
			searchDatabase.searchDatabase();

		} else if ("Kunde entfernen".equals(buttonID)) {
			new CustomerDeleteIDFrame();

		} else if ("Kundendaten ändern".equals(buttonID)) {
			new CustomerIDQuery();

		} else if ("backCustomer".equals(buttonID)) {
			new MainInterface();
			mainCustomerFrame.dispose();

		} else if ("backGarage".equals(buttonID)) {
			new MainInterface();
			garageFrame.dispose();

		}
	}
}
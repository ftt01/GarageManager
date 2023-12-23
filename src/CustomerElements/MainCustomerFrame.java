package CustomerElements;

import javax.swing.JButton;
import javax.swing.JTextField;
import Database.DatabaseConnection;
import Database.CustomerDeleteFromDatabase;
import Database.SearchDatabaseContent;
import GuiElements.CButton;
import GuiElements.CTextField;
import GuiElements.ScrollBar;
import GuiElements.Window;
import Listener.ActionListenerMain;
import Listener.CustomerListener;

public class MainCustomerFrame extends Window{
	protected static int weight = 1000;
	protected static int height = 500;
	
	private DatabaseConnection connectionData;
	private DatabaseOutputCustomer output;
	private ActionListenerMain actionListener;
	private SearchDatabaseContent search;
	private CustomerDeleteFromDatabase customerDeleteFromDatabase;
	private CustomerListener customerListener;
	
	private CButton menuButton, backButton;
	private ScrollBar scrollBar;
	private CTextField searchField;
	
	protected String[] columnNames = {"Kundennummer", "Vorname", "Nachname", "Telefonnummer"};
	protected String[] buttonNames = {"Kunde hinzufügen", "Kundendaten ändern", "Kunde entfernen", "Kunde suchen"};
	protected String[] backButtonName = {"zurück"};
	protected String[] backID = {"backCustomer"};
	
	public MainCustomerFrame(String windowName) {
		super(weight, height, windowName);

		connectionData = new DatabaseConnection();
		customerListener = new CustomerListener(this);
		
		searchField = new CTextField(1);
		scrollBar = new ScrollBar(this, connectionData);
		
		output = new DatabaseOutputCustomer(scrollBar, connectionData);
		
		search = new SearchDatabaseContent(connectionData, scrollBar, searchField);
		customerDeleteFromDatabase = new CustomerDeleteFromDatabase(this);
		
		actionListener = new ActionListenerMain(null, this, null, search, null);
		menuButton = new CButton(actionListener, 4);
		backButton = new CButton(actionListener, 1);
		
		menuButton.createButtons(20, 20, 160, 40, 40, "posY", buttonNames, buttonNames);
		for(JButton button : menuButton.getButtons()) {
			add(button);
		}
		
		searchField.createTextFields(20, 190, 160, 30, 0, "");
		for(JTextField field : searchField.getFields()) {		
			add(field);
		}
		
		backButton.createButtons(20, 400, 100, 30, 0, "", backID, backButtonName);
		for(JButton button : backButton.getButtons()) {
			add(button);
		}
		
		createScrollBar();
		
		setVisible(true);
	}
	
	public void createScrollBar() {
		connectionData.connectDatabase();
		scrollBar.createTableCustomer(4, columnNames);
		output.queryData();
	}
}
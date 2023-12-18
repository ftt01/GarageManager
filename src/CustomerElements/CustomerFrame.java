package CustomerElements;

import javax.swing.JButton;

import Database.DatabaseConnection;
import Database.DatabaseOutput;
import GuiElements.CButton;
import GuiElements.ScrollBar;
import GuiElements.Window;
import Listener.ActionListenerMain;

public class CustomerFrame extends Window{
	protected static int weight = 1000;
	protected static int height = 500;
	private CButton menuButton;
	private ActionListenerMain actionListener;
	protected String[] columnNames = {"Kd-Nr.", "Vorname", "Nachname"};
	private ScrollBar scrollBar;
	private DatabaseOutput output;
	private DatabaseConnection connectionData;
	private String[] buttonNames = {"Kunde hinzufügen", "Kunde suchen", "Kunde löschen", "Kundendaten"};
	
	public CustomerFrame(String windowName) {
		super(weight, height, windowName);

		actionListener = new ActionListenerMain(null, this);
		menuButton = new CButton(actionListener, 4);
		connectionData = new DatabaseConnection();
		scrollBar = new ScrollBar(this, connectionData);
		output = new DatabaseOutput(scrollBar, connectionData);
		
		connectionData.connectDatabase();
		scrollBar.createTable(3, columnNames);
		output.queryData();
		menuButton.createButtons(20, 20, 150, 30, 40, "posY", buttonNames, buttonNames);
		for(JButton button : menuButton.getButtons()) {
			add(button);
		}
		
		setVisible(true);
	}
	
}
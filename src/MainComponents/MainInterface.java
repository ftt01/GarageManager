package MainComponents;

import java.awt.BorderLayout;
import javax.swing.JButton;
import GuiElements.CButton;
import GuiElements.Window;
import Listener.ActionListenerMain;

public class MainInterface extends Window{
	private CButton menueButtons;
	private ActionListenerMain actionListener;
	protected String[] buttonName = {"Kunden", "Werkstatt", "Lager", "Termine", "Mitarbeiter", "Zeiterfassung"};
	
	public MainInterface(int weight, int height, String windowName) {
		super(weight, height, windowName);
		
		actionListener = new ActionListenerMain(this, null);
		menueButtons = new CButton(actionListener, 6);
		
		menueButtons.createButtons(20, 20, 120, 30, 40, "posY", buttonName, buttonName);
		for(JButton button : menueButtons.getButtons()) {
			add(button, BorderLayout.WEST);
		}
		
		setVisible(true);
	}	
}
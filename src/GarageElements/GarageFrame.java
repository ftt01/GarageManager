package GarageElements;

import javax.swing.JButton;

import GuiElements.CButton;
import GuiElements.CTextField;
import GuiElements.Window;
import Listener.ActionListenerMain;

public class GarageFrame{
	private Window frame;
	private ActionListenerMain actionListener;
	private CButton menueButton;
	private CTextField statusField;
	protected String[] menueButtonName = {"1", "2", "3"};
	
	public GarageFrame(Window frame) {
		this.frame = frame;
	}
	
	public void createGarageWindow() {
		menueButton = new CButton(actionListener, 3);
		statusField = new CTextField(1);
		
		menueButton.createButtons(20,  20, 150, 30, 40, "posY", menueButtonName, menueButtonName);
		for(JButton button : menueButton.getButtons()) {
			frame.add(button);
		}
		
		frame.setVisible(true);
	}

}
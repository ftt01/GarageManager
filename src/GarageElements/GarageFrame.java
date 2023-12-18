package GarageElements;

import GuiElements.Window;

public class GarageFrame extends Window{
	protected static int weight = 500;
	protected static int height = 500;
	
	public GarageFrame(String windowName) {
		super(weight, height, windowName);
		
		
		setVisible(true);
		
	}
	
}
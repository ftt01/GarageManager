package WarehouseElements;

import GuiElements.Window;

public class WarehouseFrame extends Window{
	protected static int weight = 500;
	protected static int height = 500;
	
	public WarehouseFrame(String windowName) {
		super(weight, height, windowName);
		
		setVisible(true);
	}

}
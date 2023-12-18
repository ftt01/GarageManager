package CustomerElements;

import GuiElements.Window;

public class CustomerFrame extends Window{
	protected static int weight = 500;
	protected static int height = 500;
	
	public CustomerFrame(String windowName) {
		super(weight, height, windowName);
		
		setVisible(true);
	}
	
}
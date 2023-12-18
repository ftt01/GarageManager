package GuiElements;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

public class CTextField {
	private JTextField[] fields;
	private int number;
	private List<String>fieldValue;
	
	public CTextField(int number) {
		this.number = number;
		fields = new JTextField[number];
		fieldValue = new ArrayList<>();
	}
	
	public void createFields(int posX, int posY, int weight, int height, int distance, String position) {
		
		for(int create = 0; create<number;create++) {
			fields[create] = new JTextField();
			fields[create].setBounds(posX, posY, weight, height);
			
			if(position.equals("posX")) {
				distance += posX;
				
			}else if(position.equals("posY")) {
				distance += posY;
			}
		}
	}
	
	public JTextField[] getFields() {
		return fields;
	}
	
	public List<String> getText(){
		return fieldValue;
	}
}
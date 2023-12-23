package GuiElements;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import CustomerElements.MainCustomerFrame;
import Database.DatabaseConnection;
import EmployeElements.EmployeFrame;
import GarageElements.GarageFrame;
import GarageElements.OrdersFrame;
import Listener.ScrollBarListener;
import WarehouseElements.WarehouseFrame;

public class ScrollBar extends JFrame {
	private JTable dataTable;
	private DefaultTableModel tableModel;
	public JButton button;
	private JScrollPane scrollBar;
	private MainCustomerFrame mainCustomerFrame;
	private GarageFrame garageFrame;
	private WarehouseFrame warehouseFrame;
	private OrdersFrame ordersFrame;
	private ScrollBarListener scrollListener;
	private EmployeFrame employeFrame;
	
	public ScrollBar(MainCustomerFrame mainCustomerFrame, DatabaseConnection connectionData) {
		this.mainCustomerFrame = mainCustomerFrame;
	}
	
	public ScrollBar(GarageFrame garageFrame, DatabaseConnection connectionData) {
		this.garageFrame = garageFrame;
	}
	
	public ScrollBar(WarehouseFrame warehouseFrame, DatabaseConnection connectionData) {
		this.warehouseFrame = warehouseFrame;
	}
	
	public ScrollBar(OrdersFrame ordersFrame, DatabaseConnection connectionData) {
		this.ordersFrame = ordersFrame;
	}
	
	public ScrollBar(EmployeFrame employeFrame, DatabaseConnection connectionData) {
		this.employeFrame = employeFrame;
	}


	public void createScrollBar(boolean isVisible, int posX, int posY, int weight, int height) {
		scrollBar = new JScrollPane(dataTable);
		scrollBar.setBounds(posX, posY, weight, height); 
		scrollBar.setVisible(isVisible);
		add(scrollBar);

		dataTable.getSelectionModel();
	}

	public void createTableCustomer(int columnNumber, String[] columnName) {
		tableModel = new DefaultTableModel();
		dataTable = new JTable(tableModel);

		for (int createColumn = 0; createColumn < columnNumber; createColumn++) {
			tableModel.addColumn(columnName[createColumn]);
		}

		createScrollBar(true, 200, 20, 600, 350);
		mainCustomerFrame.add(scrollBar);
	}
	
	public void createTableGarage(int columnNumber, String[] columnName) {
		tableModel = new DefaultTableModel();
		dataTable = new JTable(tableModel);

		for (int createColumn = 0; createColumn < columnNumber; createColumn++) {
			tableModel.addColumn(columnName[createColumn]);
		}
		
		createScrollBar(true, 220, 20, 700, 350);
		garageFrame.add(scrollBar);
	}
	

	public void createTableWarehouse(int columnNumber, String[] columnName) {
		tableModel = new DefaultTableModel();
		dataTable = new JTable(tableModel);

		for (int createColumn = 0; createColumn < columnNumber; createColumn++) {
			tableModel.addColumn(columnName[createColumn]);
		}
		
		createScrollBar(true, 210, 20, 600, 350);
		warehouseFrame.add(scrollBar);
	}
	
	public void createTableOrdersList(int columnNumber, String[] columnName) {
		tableModel = new DefaultTableModel();
		dataTable = new JTable(tableModel);

		for (int createColumn = 0; createColumn < columnNumber; createColumn++) {
			tableModel.addColumn(columnName[createColumn]);
		}
		
		createScrollBar(true, 20, 70, 630, 350);
		ordersFrame.add(scrollBar);
	}
	
	public void createEmployeList(int columnNumber, String[] columnName) {
		tableModel = new DefaultTableModel();
		dataTable = new JTable(tableModel);

		for (int createColumn = 0; createColumn < columnNumber; createColumn++) {
			tableModel.addColumn(columnName[createColumn]);
		}
		
		createScrollBar(true, 210, 20, 630, 350);
		employeFrame.add(scrollBar);
	}

	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	public JTable getDataTable() {
		return dataTable;
	}

	
}
package GuiElements;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import CustomerElements.CustomerFrame;
import Database.DatabaseConnection;
import MainComponents.ActionListenerButton;

public class ScrollBar extends JFrame {
	private JTable dataTable;
	private DefaultTableModel tableModel;
	public JButton button;
	private JScrollPane scrollBar;
	private DatabaseConnection connectionData;
	private CustomerFrame customerFrame;

	public ScrollBar(CustomerFrame customerFrame, DatabaseConnection connectionData) {
		this.customerFrame = customerFrame;
		this.connectionData = connectionData;
	}

	public void createScrollBar(boolean isVisible) {
		scrollBar = new JScrollPane(dataTable);
		scrollBar.setBounds(200, 20, 600, 350);
		scrollBar.setVisible(isVisible);
		add(scrollBar);

		dataTable.getSelectionModel();
	}

	public void createTable(int columnNumber, String[] columnName) {
		tableModel = new DefaultTableModel();
		dataTable = new JTable(tableModel);

		for (int createColumn = 0; createColumn < columnNumber; createColumn++) {
			tableModel.addColumn(columnName[createColumn]);
		}

		createScrollBar(true);
		customerFrame.add(scrollBar);
	}

	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	public JTable getDataTable() {
		return dataTable;
	}

	public JScrollPane getScrollBar() {
		return scrollBar;
	}
}
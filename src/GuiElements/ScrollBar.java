package GuiElements;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Database.DatabaseConnection;

public class ScrollBar {
	private JTable dataTable;
	private DefaultTableModel tableModel;
	public JButton button;
	private JScrollPane scrollBar;
	private DatabaseConnection connectionData;
	private Window frame;

	public ScrollBar(Window frame, DatabaseConnection connectionData) {
		this.frame = frame;
		this.connectionData = connectionData;
	}

	public void createScrollBar() {
		scrollBar = new JScrollPane(dataTable);
		scrollBar.setBounds(200, 20, 600, 350);
		frame.add(scrollBar);

		dataTable.getSelectionModel();
	}

	public void createTable(int columnNumber, String[] columnName) {
		tableModel = new DefaultTableModel();
		dataTable = new JTable(tableModel);

		for (int createColumn = 0; createColumn < columnNumber; createColumn++) {
			tableModel.addColumn(columnName[createColumn]);
		}

		createScrollBar();
		frame.add(scrollBar);
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
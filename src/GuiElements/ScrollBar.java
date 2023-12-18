package GuiElements;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Database.DatabaseConnection;
import Database.DatabaseOutput;
import MainComponents.ActionListenerButton;

public class ScrollBar extends JFrame{
	private DatabaseConnection connectionData;
	private Window frame;
	private DatabaseOutput output;
	private JTable dataTable;
	private DefaultTableModel tableModel;
	public JButton button;
	private JScrollPane scrollBar;

	public ScrollBar(Window frame, ActionListenerButton actionListener, DatabaseOutput output) {
		this.frame = frame;
	}

	public void createScrollBar(boolean isVisible) {
		scrollBar = new JScrollPane(dataTable);
		scrollBar.setBounds(200, 20, 600, 350);
		scrollBar.setVisible(isVisible);
		add(scrollBar);

		dataTable.getSelectionModel();
	}

	public void createTable(String[] columnNames, TableColumn[] columns) {
		tableModel = new DefaultTableModel();
		dataTable = new JTable(tableModel);
		
		
		columnNames = output.getColumnNames();
        for (String columnName : columnNames) {
            tableModel.addColumn(columnName);
        }

        columns = new TableColumn[columnNames.length];
        for (int i = 0; i < columnNames.length; i++) {
            columns[i] = dataTable.getColumnModel().getColumn(i);
            columns[i].setPreferredWidth(10);
        }

		createScrollBar(true);
		frame.add(scrollBar);
	}

	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	public JTable getDataTable() {
		return dataTable;
	}
}
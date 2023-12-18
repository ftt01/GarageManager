package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import GuiElements.CTextField;

public class InputToDatabase {
	private DatabaseConnection connectionData;
	private CTextField insertText;
	private String dvdName;
	private List<String> textvalue;

	public InputToDatabase(DatabaseConnection connectionData, CTextField insertText) {
		this.connectionData = connectionData;
		this.insertText = insertText;
		textvalue = new ArrayList<>();
		textvalue = insertText.getText();
	}
/*
	public void insertData(int number, String[] insertQuerys) {

		try {
			connectionData.connectDatabase();
			
			for (int index = 0; index < number; index++) {
				insertQuery[index] = "INSERT INTO dvd (`dvdName`, `storageLocation`, `createYear`, `actors`, `genre`) VALUES (?, ?, ?, ?, ?)";
			}

			PreparedStatement preparedStatement = connectionData.connection.prepareStatement(insertQuery);

			name = inserTextFields[0].getText();

			if (isDuplicateName(name)) {
				System.out.println("Entry with this DVD name already exists. Insertion aborted.");
				return;
			}

			try {
				preparedStatement.setString(1, inserTextFields[0].getText());
				preparedStatement.setString(2, inserTextFields[1].getText());
				preparedStatement.setString(3, inserTextFields[2].getText());
				preparedStatement.setString(4, inserTextFields[3].getText());
				preparedStatement.setString(5, inserTextFields[4].getText());

				preparedStatement.executeUpdate();
				System.out.println("Record successfully inserted.");

			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Not all fields filled out", "Abort", JOptionPane.WARNING_MESSAGE);
			}
		} catch (SQLException e) {

		}
	}*/

	private boolean isDuplicateName(String name) throws SQLException {
		ResultSet resultSet = connectionData.statement
				.executeQuery("SELECT * FROM dvd WHERE Name = '" + name + "'");
		return resultSet.next();
	}
}


package jsp_azure_test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class IP_Task7_Ghorpade_Bhairavsingh {
	private Connection conn;
	// Azure SQL connection credentials
	private String server = "ghor0002-sql-server.database.windows.net";
	private String database = "cs-dsa-4513-sql-db";
	private String username = "User_Name";
	private String password = "******";
	// Resulting connection string
	final private String url =
			String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;",server, database, username, password);
	// Initialize and save the database connection
	private void getDBConnection() throws SQLException {
		if (conn != null) {
			return;
			}
		this.conn = DriverManager.getConnection(url);
		}
	// Return the result of selecting everything from the movie_night table
	public ResultSet getCustomers() throws SQLException {
		getDBConnection();
		final String sqlQuery = "SELECT * FROM Customer;";
		final PreparedStatement stmt = conn.prepareStatement(sqlQuery);
		return stmt.executeQuery();
		}
	// Inserts a record into the movie_night table with the given attribute values
	public boolean addCustomer(
			String cust_name, String cust_address, int cust_category) throws SQLException {
		getDBConnection(); // Prepare the database connection
		// Prepare the SQL statement
		final String sqlQuery =
				"INSERT INTO Customer " +
		"(cust_name, cust_address, cust_category) " +
						"VALUES " +
		"(?, ?, ?)";
		final PreparedStatement stmt = conn.prepareStatement(sqlQuery);
		// Replace the '?' in the above statement with the given attribute values
		stmt.setString(1, cust_name);
		stmt.setString(2, cust_address);
		stmt.setInt(3, cust_category);
		// Execute the query, if only one record is updated, then we indicate success by returning true
		return stmt.executeUpdate() == 1;
		}
	
	
	public ResultSet Retrieve_Customer_Given_Range (int in_start_range, int in_end_range) throws SQLException
	{
		getDBConnection(); // Prepare the database connection
		// Prepare the SQL statement
		final String sqlQuery = "{ call Retrieve_Customer_Given_Range(?, ?) }"; //Calling procedure #1
        final ResultSet resultSet;
		//final String sqlQuery = "{ call Retrieve_Customer_Given_Range(?, ?) }";
		final PreparedStatement stmt = conn.prepareStatement(sqlQuery);
		// Replace the '?' in the above statement with the given attribute values
		stmt.setInt(1, in_start_range);
		stmt.setInt(2, in_end_range);
		// Execute the query, if only one record is updated, then we indicate success by returning true
		resultSet = stmt.executeQuery();
		return resultSet;
		}
	}
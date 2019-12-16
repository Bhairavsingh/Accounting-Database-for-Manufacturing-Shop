


import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;


public class IP_Task5_Ghorpade_Bhairavsingh
{	
	//Defining class for inserting Customer.
	public static void Insert_Customer(String cust_name, String cust_address, int cust_category)
	{ 
		//Calling procedure for Inserting Customer.
        String query = "{ call Insert_Customer(?, ?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setString(1, cust_name);
            	stmt.setString(2, cust_address);
            	stmt.setInt(3, cust_category);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for Inserting department.
	public static void Insert_Department(int dept_num, String dept_data)
	{ 
		//Calling procedure for inserting department.
        String query = "{ call Insert_Department(?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Department");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1, dept_num);
            	stmt.setString(2, dept_data);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for inserting assembly
	public static void Insert_Assembly(int assembly_id, String cust_name, String assembly_details, String order_date_char)
	{ 
		//Calling procedure Insert_Assembly
        String query = "{ call Insert_Assembly(?, ?, ?, ?) }";
        ResultSet rs;
        // Connect to database
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Assembly");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure
            	stmt.setInt(1, assembly_id);
            	stmt.setString(2, cust_name);
            	stmt.setString(3, assembly_details);
            	stmt.setString(4, order_date_char);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for inserting fit process.
	public static void Insert_Fit_Process (int process_id, int dept_num, String process_data, String fit_type)
	{ 
		//Calling procedure Insert_Fit_Process.
        String query = "{ call Insert_Fit_Process(?, ?, ?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Fit Process");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure
            	stmt.setInt(1, process_id);
            	stmt.setInt(2, dept_num);
            	stmt.setString(3, process_data);
            	stmt.setString(4, fit_type);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for inserting paint process.
	public static void Insert_Paint_Process (int process_id, int dept_num, String process_data, String paint_type, String painting_method)
	{ 
		//Calling procedure Insert_Paint_Process.
        String query = "{ call Insert_Paint_Process(?, ?, ?, ?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Paint Process");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure
            	stmt.setInt(1, process_id);
            	stmt.setInt(2, dept_num);
            	stmt.setString(3, process_data);
            	stmt.setString(4, paint_type);
            	stmt.setString(5, painting_method);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for inserting cut process.
	public static void Insert_Cut_Process (int process_id, int dept_num, String process_data, String cutting_type, String machine_type)
	{ 
		//Calling procedure Insert_Cut_Process.
        String query = "{ call Insert_Cut_Process(?, ?, ?, ?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Cut Process");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1, process_id);
            	stmt.setInt(2, dept_num);
            	stmt.setString(3, process_data);
            	stmt.setString(4, cutting_type);
            	stmt.setString(5, machine_type);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for inserting assembly account.
	public static void Insert_Assembly_Account (int acc_number, String est_date_char, float cost, int assembly_id)
	{ 
		//Calling procedure Insert_Assembly_Account.
        String query = "{ call Insert_Assembly_Account(?, ?, ?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Assembly Account");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure
            	stmt.setInt(1, acc_number);
            	stmt.setString(2, est_date_char);
            	stmt.setFloat(3, cost);
            	stmt.setInt(4, assembly_id);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for inserting department account.
	public static void Insert_Dept_Account (int acc_number, String est_date_char, float cost, int dept_num)
	{ 
		//Calling procedure Insert_Dept_Account.
        String query = "{ call Insert_Dept_Account(?, ?, ?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Department Account");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1, acc_number);
            	stmt.setString(2, est_date_char);
            	stmt.setFloat(3, cost);
            	stmt.setInt(4, dept_num);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for inserting process account.
	public static void Insert_Process_Account (int acc_number, String est_date_char, float cost, int process_id)
	{ 
		//Calling procedure Insert_Process_Account.
        String query = "{ call Insert_Process_Account(?, ?, ?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Process Account");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure
            	stmt.setInt(1, acc_number);
            	stmt.setString(2, est_date_char);
            	stmt.setFloat(3, cost);
            	stmt.setInt(4, process_id);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for inserting job.
	public static void Insert_Job (int job_number, String commenced_date_char, int assembly_id, int process_id)
	{ 
		//Calling procedure Insert_Job.
        String query = "{ call Insert_Job(?, ?, ?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Job");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1, job_number);
            	stmt.setString(2, commenced_date_char);
            	stmt.setInt(3, assembly_id);
            	stmt.setInt(4, process_id);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for inserting cut job.
	public static void Insert_Cut_Job (int job_number, String machine_type, float machining_time, String material, float labor_time, String completion_date_char)
	{ 
		//Calling procedure Insert_Cut_Job.
        String query = "{ call Insert_Cut_Job(?, ?, ?, ?, ?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Cut Job");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1, job_number);
            	stmt.setString(2, machine_type);
            	stmt.setFloat(3, machining_time);
            	stmt.setString(4, material);
            	stmt.setFloat(5, labor_time);
            	stmt.setString(6, completion_date_char);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for inserting paint job.
	public static void Insert_Paint_Job (int job_number, String color, float volume, float labor_time, String completion_date_char)
	{ 
		//Calling procedure Insert_Paint_Job.
        String query = "{ call Insert_Paint_Job(?, ?, ?, ?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Paint Job");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1, job_number);
            	stmt.setString(2, color);
            	stmt.setFloat(3, volume);
            	stmt.setFloat(4, labor_time);
            	stmt.setString(5, completion_date_char);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for inserting fit job.
	public static void Insert_Fit_Job (int job_number, float labor_time, String completion_date_char)
	{ 
		//Calling procedure Insert_Fit_Job.
        String query = "{ call Insert_Fit_Job(?, ?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Fit Job");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1, job_number);
            	stmt.setFloat(3, labor_time);
            	stmt.setString(4, completion_date_char);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for updating cost.
	public static void Update_Cost (int tr_number, float supp_cost, int job_number)
	{ 
		//Calling procedure Update_Cost.
        String query = "{ call Update_Cost(?, ?, ?) }";
        ResultSet rs;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Updating Cost");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1, tr_number);
            	stmt.setFloat(2, supp_cost);
            	stmt.setInt(3, job_number);
            	rs = stmt.executeQuery();
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for retrieving assembly cost.
	public static void Retrieve_Assembly_Cost(int assembly_id)
	{ 
		//Calling procedure Retrieve_Assembly_Cost.
        String query = "{ call Retrieve_Assembly_Cost(?) }";
        ResultSet resultSet;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Retrieve Assembly Cost");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1,  assembly_id);
            	resultSet = stmt.executeQuery();
            	//Displaying table from SQL database.
            	while (resultSet.next())
            	{
                    System.out.println(String.format("%s | %s |",
                                  resultSet.getString(1),
                                  resultSet.getString(2)));
             }
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for retrieving labor time.
	public static void Retrieve_Labor_Time(int input_dept_num, String input_completion_date_char)
	{ 
		//Calling procedure Retrieve_Labor_Time.
        String query = "{ call Retrieve_Labor_Time(?, ?) }";
        ResultSet resultSet;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Retrieve Labor Time");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure
            	stmt.setInt(1,  input_dept_num);
            	stmt.setString(2,  input_completion_date_char);
            	resultSet = stmt.executeQuery();
            	//Displaying table from SQL database.
            	while (resultSet.next()) {
                    System.out.println(String.format("%s |",
                                  resultSet.getString(1)));
             }
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for retrieving processes.
	public static void Retrieve_Processes(int assembly_id)
	{ 
		//Calling procedure Retrieve_Processes.
        String query = "{ call Retrieve_Processes(?) }";
        ResultSet resultSet;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Retrieve Processes");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1,  assembly_id);
            	resultSet = stmt.executeQuery();
            	//Displaying table from SQL database.
            	while (resultSet.next()) {
                    System.out.println(String.format("%s | %s | %s | %s |",
                                  resultSet.getString(1),
                                  resultSet.getString(2),
                                  resultSet.getString(3),
                                  resultSet.getString(4)));
             }
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for retrieving cut job data.
	public static void Retrieve_Cut_Job_Type_Data(int input_dept_num, String input_completion_date_char)
	{ 
		//Calling procedure Retrieve_Cut_Job_Type_Data.
        String query = "{ call Retrieve_Cut_Job_Type_Data(?, ?) }";
        ResultSet resultSet;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Retrieving Data of Cut Job Type");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1,  input_dept_num);
            	stmt.setString(2,  input_completion_date_char);
            	resultSet = stmt.executeQuery();
            	//Displaying table from SQL database.
            	while (resultSet.next()) {
                    System.out.println(String.format("%s | %s | %s | %s | %s | %s | %s | %s |",
                                  resultSet.getString(1),
                                  resultSet.getString(2),
                                  resultSet.getString(3),
                                  resultSet.getString(4),
                                  resultSet.getString(5),
                                  resultSet.getString(6),
                                  resultSet.getString(7),
                                  resultSet.getString(8)));
             }
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for retrieving paint job data.
	public static void Retrieve_Paint_Job_Type_Data(int input_dept_num, String input_completion_date_char)
	{ 
		//Calling procedure Retrieve_Paint_Job_Type_Data.
        String query = "{ call Retrieve_Paint_Job_Type_Data(?, ?) }";
        ResultSet resultSet;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Retrieving Data of Paint Job Type");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1,  input_dept_num);
            	stmt.setString(2,  input_completion_date_char);
            	resultSet = stmt.executeQuery();
            	//Displaying table from SQL database.
            	while (resultSet.next()) {
                    System.out.println(String.format("%s | %s | %s | %s | %s | %s | %s |",
                                  resultSet.getString(1),
                                  resultSet.getString(2),
                                  resultSet.getString(3),
                                  resultSet.getString(4),
                                  resultSet.getString(5),
                                  resultSet.getString(6),
                                  resultSet.getString(7)));
             }
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for retrieving fit job data.
	public static void Retrieve_Fit_Job_Type_Data(int input_dept_num, String input_completion_date_char)
	{ 
		//Calling procedure Retrieve_Fit_Job_Type_Data.
        String query = "{ call Retrieve_Fit_Job_Type_Data(?, ?) }";
        ResultSet resultSet;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Retrieving Data of Cut Job Type");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure
            	stmt.setInt(1,  input_dept_num);
            	stmt.setString(2,  input_completion_date_char);
            	resultSet = stmt.executeQuery();
            	//Displaying table from SQL database.
            	while (resultSet.next()) {
                    System.out.println(String.format("%s | %s | %s | %s | %s |",
                                  resultSet.getString(1),
                                  resultSet.getString(2),
                                  resultSet.getString(3),
                                  resultSet.getString(4),
                                  resultSet.getString(5)));
             }
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for retrieving customer with given range.
	public static void Retrieve_Customer_Given_Range (int in_start_range, int in_end_range)
	{ 
		//Calling procedure Retrieve_Customer_Given_Range.
        String query = "{ call Retrieve_Customer_Given_Range(?, ?) }";
        ResultSet resultSet;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema);
        	System.out.println("Retrieve Customers from Given Range");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure
            	stmt.setInt(1, in_start_range);
            	stmt.setInt(2, in_end_range);
            	resultSet = stmt.executeQuery();
            	//Displaying table from SQL database.
            	while (resultSet.next()) {
                    System.out.println(String.format("%s | %s | %s |",
                                  resultSet.getString(1),
                                  resultSet.getString(2),
                                  resultSet.getInt(3)));
             }
            	
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            }
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for delete cut jobs.
	public static void Delete_Cut_Jobs(int in_start_job_num, int in_end_job_num)
	{ 
		//Calling procedure Delete_Cut_Jobs.
        String query = "{ call Delete_Cut_Jobs(?, ?) }";
        ResultSet resultSet;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Delete Cut Jobs");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure
            	stmt.setInt(1,  in_start_job_num);
            	stmt.setInt(2,  in_end_job_num);
            	resultSet = stmt.executeQuery();
            	
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for changing color of paint job.
	public static void Change_Color(int in_start_job_num, int in_end_job_num, String color)
	{ 
		//Calling procedure Change_Color.
        String query = "{ call Change_Color(?, ?, ?) }";
        ResultSet resultSet;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Change Color");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure
            	stmt.setInt(1,  in_start_job_num);
            	stmt.setInt(2,  in_end_job_num);
            	stmt.setString(3,  color);
            	resultSet = stmt.executeQuery();
            	
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	//Defining class for exporting customer data.
	public static void Export_Retrieve_Customer_Given_Range (int in_start_range, int in_end_range, String file_name) throws IOException
	{ 
		//Calling procedure Retrieve_Customer_Given_Range.
        String query = "{ call Retrieve_Customer_Given_Range(?, ?) }";
        ResultSet resultSet;
        //Connecting to database.
        final String hostName = "ghor0002-sql-server.database.windows.net"; 
        final String dbName = "cs-dsa-4513-sql-db";
        final String user = "User_Name";
        final String password = "******";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Retrieve Customers from Given Range");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            	//Assigning parameters to the procedure.
            	stmt.setInt(1, in_start_range);
            	stmt.setInt(2, in_end_range);
            	resultSet = stmt.executeQuery();
            	
            	//Creating a csv file to export the customer data.
            	FileWriter Export_file = new FileWriter(file_name);
            	Export_file.append("Customer Name");
            	Export_file.append(",");
            	Export_file.append("Customer Address");
            	Export_file.append(",");
            	Export_file.append("Customer Category");
            	Export_file.append("\n");
            	
            	//Writing the csv file to export the customer data.
            	while (resultSet.next()) {
            		Export_file.append(resultSet.getString(1));
                	Export_file.append(",");
                	Export_file.append(resultSet.getString(2));
                	Export_file.append(",");
                	Export_file.append(resultSet.getString(3));
                	Export_file.append("\n");
            		
             }
            	//closing the file.
            	Export_file.close();
            	
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            }
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
        }
	
	
	public static void main(String[] args) throws IOException
	{
		//Defining line separator.
		String nl = System.getProperty("line.separator"); 
		System.out.println("1. Enter a new customer" + nl + "2. Enter a new department" + nl + "3. Enter a new assembly"
		+ nl + "4. Enter a new process" + nl + "5. Enter a new account " + nl + "6. Enter a new job" + nl + "7. Enter a job type"
				  + nl + "8. Update the cost in accounts" + nl + "9. Retrieve assembly cost of given assembly Id" + nl + "10. Retrieve the labor time on given date on given date"
				   + nl + "11. Retrieve the cost on given assembly_id" + nl + "12. Retrieve the jobs completed during given date and department" + nl + "13. Retrieve the customers with given range of customer category"
				    + nl + "14. Delete all the cut jobs whose job number is in given range" + nl + "15. Change the color of given paint job" + nl + "16. Import file with customer information."
				   + nl + "17. Export Retrieved customer's details with given range of customer category" + nl + "18. Exit");
		
		while (true)
		{
			//Obtaining user input for options.
			System.out.println("Please Enter Option Number: ");
			Scanner user_input = new Scanner(System.in);
			int option = user_input.nextInt();

			if (option == 1)
			{
				System.out.println("Please Enter New Customer's Category: ");
				int cust_category = user_input.nextInt();
				
				System.out.println("Please Enter New Customer's Name: ");
				String cust_name = user_input.next();
				
				System.out.println("Please Enter New Customer's Address: ");
				String cust_address = user_input.nextLine();
				
				Insert_Customer(cust_name, cust_address, cust_category);
			}
			else if (option == 2)
			{
				System.out.println("Please Enter New Department Number: ");
				int dept_num = user_input.nextInt();
				
				System.out.println("Please Enter New Department's Department Data: ");
				String dept_data = user_input.next();
				
				Insert_Department(dept_num, dept_data);
			}
			else if (option == 3)
			{
				System.out.println("Please Enter New Assembly Id: ");
				int assembly_id = user_input.nextInt();
				
				System.out.println("Please Enter Customer's Name: ");
				String cust_name = user_input.next();
				
				System.out.println("Please Enter Assembly Details: ");
				String assembly_details = user_input.next();
				
				System.out.println("Please Enter Order Date (in YYYY-MM-DD Format): ");
				String order_date_char = user_input.next();
				
				Insert_Assembly(assembly_id, cust_name, assembly_details, order_date_char);
			}
			else if (option == 4)
			{
				String n2 = System.getProperty("line.separator");
				System.out.println("Please select process, you want to enter." + n2 + "1. Fit Process" + n2 + "2. Paint Process" + n2 + "3. Cut Process");
				int process_option = user_input.nextInt();
				if (process_option == 1)
				{
					System.out.println("Please Enter New Process Id: ");
					int process_id = user_input.nextInt();
					
					System.out.println("Please Enter Department Number: ");
					int dept_num  = user_input.nextInt();
					
					System.out.println("Please Enter Process Data: ");
					String process_data = user_input.next();
					
					System.out.println("Please Enter Fit Type: ");
					String fit_type = user_input.next();
					
					Insert_Fit_Process(process_id, dept_num, process_data, fit_type);
				}
				else if (process_option == 2)
				{
					System.out.println("Please Enter New Process Id: ");
					int process_id = user_input.nextInt();
					
					System.out.println("Please Enter Department Number: ");
					int dept_num  = user_input.nextInt();
					
					System.out.println("Please Enter Process Data: ");
					String process_data = user_input.next();
					
					System.out.println("Please Enter Paint Type: ");
					String paint_type = user_input.next();
					
					System.out.println("Please Enter Painting Method: ");
					String painting_method = user_input.next();
					
					Insert_Paint_Process(process_id, dept_num, process_data, paint_type, painting_method);
				}
				else if (process_option == 3)
				{
					System.out.println("Please Enter New Process Id: ");
					int process_id = user_input.nextInt();
					
					System.out.println("Please Enter Department Number: ");
					int dept_num  = user_input.nextInt();
					
					System.out.println("Please Enter Process Data: ");
					String process_data = user_input.next();
					
					System.out.println("Please Enter Cutting Type: ");
					String cutting_type = user_input.next();
					
					System.out.println("Please Enter Machine Method: ");
					String machine_type = user_input.next();
					
					Insert_Cut_Process(process_id, dept_num, process_data, cutting_type, machine_type);
				}
			}
			else if (option == 5)
			{
				String n2 = System.getProperty("line.separator");
				System.out.println("Please select account, you want to enter." + n2 + "1. Assembly Account" + n2 + "2. Department Account" + n2 + "3. Process Account");
				int account_option = user_input.nextInt();
				if (account_option == 1)
				{
					System.out.println("Please Enter New Account Number: ");
					int acc_number = user_input.nextInt();
					
					System.out.println("Please Enter Assembly Id: ");
					int assembly_id  = user_input.nextInt();
					
					System.out.println("Please Enter Initial Cost (If no initial cost, then enter 0): ");
					float cost  = user_input.nextFloat();
					
					System.out.println("Please Enter Account Established Date (in YYYY-MM-DD Format): ");
					String est_date_char = user_input.next();
					
					Insert_Assembly_Account(acc_number, est_date_char, cost, assembly_id);
				}
				else if (account_option == 2)
				{
					System.out.println("Please Enter New Account Number: ");
					int acc_number = user_input.nextInt();
					
					System.out.println("Please Enter Department Number: ");
					int dept_num  = user_input.nextInt();
					
					System.out.println("Please Enter Initial Cost (If no initial cost, then enter 0): ");
					float cost  = user_input.nextFloat();
					
					System.out.println("Please Enter Account Established Date (in YYYY-MM-DD Format): ");
					String est_date_char = user_input.next();
					
					Insert_Dept_Account(acc_number, est_date_char, cost, dept_num);
				}
				else if (account_option == 3)
				{
					System.out.println("Please Enter New Account Number: ");
					int acc_number = user_input.nextInt();
					
					System.out.println("Please Enter Process Id: ");
					int process_id  = user_input.nextInt();
					
					System.out.println("Please Enter Initial Cost (If no initial cost, then enter 0): ");
					float cost  = user_input.nextFloat();
					
					System.out.println("Please Enter Account Established Date (in YYYY-MM-DD Format): ");
					String est_date_char = user_input.next();
					
					Insert_Process_Account(acc_number, est_date_char, cost, process_id);
				}
			}
			else if (option == 6)
			{
				System.out.println("Please Enter New Job Number: ");
				int job_number = user_input.nextInt();
				
				System.out.println("Please Enter Assembly Id: ");
				int assembly_id = user_input.nextInt();
				
				System.out.println("Please Enter Process Id: ");
				int process_id = user_input.nextInt();
				
				System.out.println("Please Enter Order Date (in YYYY-MM-DD Format): ");
				String commenced_date_char = user_input.next();
				
				Insert_Job(job_number, commenced_date_char, assembly_id, process_id);
			}
			else if (option == 7)
			{
				String n2 = System.getProperty("line.separator");
				System.out.println("Please select type of completed job, you want to enter." + n2 + "1. Cut Job" + n2 + "2. Paint Job" + n2 + "3. Fit Job");
				int job_option = user_input.nextInt();
				if (job_option == 1)
				{
					System.out.println("Please Enter Completed Job Number: ");
					int job_number = user_input.nextInt();
					
					System.out.println("Please Enter Machining Time Required: ");
					float machining_time  = user_input.nextFloat();
					
					System.out.println("Please Enter Labor Time: ");
					float labor_time  = user_input.nextFloat();
					
					System.out.println("Please Enter Machine Type Used: ");
					String machine_type  = user_input.next();
					
					System.out.println("Please Enter Material Used: ");
					String material  = user_input.next();
					
					System.out.println("Please Enter Job Completion Date (in YYYY-MM-DD Format): ");
					String completion_date_char = user_input.next();
					
					Insert_Cut_Job(job_number, machine_type, machining_time, material, labor_time, completion_date_char);
				}
				else if (job_option == 2)
				{
					System.out.println("Please Enter Completed Job Number: ");
					int job_number = user_input.nextInt();
					
					System.out.println("Please Enter volume of color used: ");
					float volume  = user_input.nextFloat();
					
					System.out.println("Please Enter Labor Time: ");
					float labor_time  = user_input.nextFloat();
					
					System.out.println("Please Enter Color: ");
					String color = user_input.next();
					
					System.out.println("Please Enter Job Completion Date (in YYYY-MM-DD Format): ");
					String completion_date_char = user_input.next();
					
					Insert_Paint_Job(job_number, color, volume, labor_time, completion_date_char);
				}
				else if (job_option == 3)
				{
					System.out.println("Please Enter Completed Job Number: ");
					int job_number = user_input.nextInt();
					
					System.out.println("Please Enter Labor Time: ");
					float labor_time  = user_input.nextFloat();
					
					System.out.println("Please Enter Job Completion Date (in YYYY-MM-DD Format): ");
					String completion_date_char = user_input.next();
					
					Insert_Fit_Job(job_number, labor_time, completion_date_char);
				}
			}
			else if (option == 8)
			{
				System.out.println("Please Enter New Transaction Number: ");
				int tr_number = user_input.nextInt();
				
				System.out.println("Please Enter The Cost: ");
				float supp_cost = user_input.nextFloat();
				
				System.out.println("Please Enter Job Number: ");
				int job_number = user_input.nextInt();
				
				Update_Cost(tr_number, supp_cost, job_number);
			}
			else if (option == 9)
			{
				System.out.println("Please Enter Assembly Id: ");
				int assembly_id = user_input.nextInt();
				
				Retrieve_Assembly_Cost(assembly_id);
			}
			else if (option == 10)
			{
				System.out.println("Please Enter Department Number: ");
				int input_dept_num = user_input.nextInt();
				
				System.out.println("Please Enter Job Completion Date (in YYYY-MM-DD Format): ");
				String input_completion_date_char = user_input.next();
				
				Retrieve_Labor_Time(input_dept_num, input_completion_date_char);
			}
			else if (option == 11)
			{
				System.out.println("Please Enter Assembly Id: ");
				int assembly_id = user_input.nextInt();
				
				Retrieve_Processes(assembly_id);
			}
			else if (option == 12)
			{
				System.out.println("Please Enter Department Number: ");
				int input_dept_num = user_input.nextInt();
				
				System.out.println("Please Enter Job Completion Date (in YYYY-MM-DD Format): ");
				String input_completion_date_char = user_input.next();
				
				Retrieve_Cut_Job_Type_Data(input_dept_num, input_completion_date_char);
				Retrieve_Paint_Job_Type_Data(input_dept_num, input_completion_date_char);
				Retrieve_Fit_Job_Type_Data(input_dept_num, input_completion_date_char);
			}
			else if (option == 13)
			{
				System.out.println("Please Enter Customer Category's Range Start Value: ");
				int in_start_range = user_input.nextInt();
				
				System.out.println("Please Range Customer Category's End Value: ");
				int in_end_range = user_input.nextInt();
				
				Retrieve_Customer_Given_Range(in_start_range, in_end_range);
			}
			else if (option == 14)
			{
				System.out.println("Please Customer Job Number's Range Start Value: ");
				int in_start_job_num = user_input.nextInt();
				
				System.out.println("Please Customer Job Number's Range End Value: ");
				int in_end_job_num = user_input.nextInt();
				
				Delete_Cut_Jobs(in_start_job_num, in_end_job_num);
			}
			else if (option == 15)
			{
				System.out.println("Please Job Number's Range Start Value: ");
				int in_start_job_num = user_input.nextInt();
				
				System.out.println("Please Job Number's Range End Value: ");
				int in_end_job_num = user_input.nextInt();
				
				System.out.println("Please Enter New Color: ");
				String color = user_input.next();
				
				Change_Color(in_start_job_num, in_end_job_num, color);
			}
			else if (option == 16)
			{
				System.out.println("Please Enter File Name: ");
				String file_path = user_input.next();
				BufferedReader input_file = new BufferedReader(new FileReader(file_path));
				String customer_record;
				while ((customer_record = input_file.readLine()) != null) {
				    String[] data = customer_record.split(",");
				    String cust_name = data[0];
				    String cust_address = data[1];
				    int cust_category = Integer.parseInt(data[2]);
				    Insert_Customer(cust_name, cust_address, cust_category);
				}
				input_file.close();
			}
			else if (option == 17)
			{
				System.out.println("Please Enter New File Name: ");
				String file_name = user_input.next();
				
				System.out.println("Please Enter Customer Category's Range Start Value: ");
				int in_start_range = user_input.nextInt();
				
				System.out.println("Please Range Customer Category's End Value: ");
				int in_end_range = user_input.nextInt();
				
				Export_Retrieve_Customer_Given_Range(in_start_range, in_end_range, file_name);
			}
			
			else if (option == 18)
			{
				//Breaking while loop and terminating the system.
				System.out.println("Program is terminating! Good Bye!");
				System.exit(0);
			}
		}
		
	}
		
}




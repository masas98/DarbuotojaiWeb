package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {
	private static MySQL mysql=null;
	private Connection connection=null;
	
	private MySQL() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//conn - prisijungimas prie DB, kaip norime pasivadinti kintamaji
			this.connection=DriverManager.getConnection("jdbc:mysql://localhost/darbuotojai?user=JavaUser&password=slaptazodis123");
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection(){
		if (mysql==null) {
			mysql=new MySQL();
		}
		return mysql.connection;
	}

}

 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

	private final String name;
	private final String host;
	private final int port;
	private final String user;
	private final String passwd;
	
	private Connection conn = null;

	public DataBase(String name, String user, String passwd) {
		this.name = name;
		host = "localhost";
		port = 5432;
		this.user = user;
		this.passwd = passwd;
	}
	
	public void connect() {
		try {
			conn = DriverManager.getConnection(getURL(), user, passwd);
			System.out.println("Connexion "+ name+ " accomplie");
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
	}
	
	private String getURL() {
		return "jdbc:postgresql://"+host+":"+port+"/"+name;
	}
}

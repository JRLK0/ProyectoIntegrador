package accesoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.sqlite.SQLiteConfig;

public class AccesoDB {
	private String driver;
	private String url;

	public AccesoDB(String driver, String url) {
		this.driver = driver;
		this.url = url;
	}

	public AccesoDB() {
		driver = "org.sqlite.JDBC";
		url = "jdbc:sqlite:dbSQLite/LOGIN.db";//Esto hay que cambiarlo.
	}

	public Connection getConexion() throws ClassNotFoundException, SQLException {

		Class.forName(driver);

		SQLiteConfig config = new SQLiteConfig(); //objeto de configuracion de dicha conexion		
		config.enforceForeignKeys(true);  //controlar las forengkeys
		
		Connection con = DriverManager.getConnection(url,config.toProperties()); 
		System.out.println("Conexion establecida");
		return con;
	}
}

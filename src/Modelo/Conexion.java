package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static final String controlador = "com.mysql.cj.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/data_cajero";
	public static final String usuario = "root";
	public static final String clave = "Tripa317";
	private Connection conexion = null;
	
	/*static {
		try {
			
			Class.forName(controlador);		
		}catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();		
		}
	}*/
	
	public Connection Conectar(){
	
		
		try {
			Class.forName(controlador);
			conexion = (Connection) DriverManager.getConnection(url,usuario,clave);
		}catch (SQLException | ClassNotFoundException e) {
			System.err.println(e	);
		}
		
		return conexion;
	}
}
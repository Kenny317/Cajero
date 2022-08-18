package Cajero;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		//Menu menu = new Menu();
		
		/*Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {

			cn = conexion.Conectar();
			stm = cn.createStatement();
			rs= stm.executeQuery("select *from cuenta_usuario");
			
			while(rs.next()) {
				int idUsuario = rs.getInt(1);
				String  usuario = rs.getString(2);
				String clave = rs.getString(3);
				System.out.println(idUsuario + " - " + usuario + " - " + clave);
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}*/
	}
}

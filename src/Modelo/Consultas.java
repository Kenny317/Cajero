package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Consultas extends Conexion {
	
	public boolean Registro(Cuenta cuen) {
		PreparedStatement ps = null;
		Connection con = Conectar();
		
		String sql = "insert into usuarios_cajero (nombre,apellido,id,telefono,correo,fecha_nacimiento,contraseña) value (?,?,?,?,?,?,?) ";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,cuen.getNombre());
			ps.setString(2,cuen.getApellido());
			ps.setInt(3,cuen.getId());
			ps.setInt(4,cuen.getTelefono());
			ps.setString(5,cuen.getCorreo());
			ps.setString(6,cuen.getFechaNaci());
			ps.setString(7,cuen.getContraseña());
			ps.execute();
			
			return true;
		}catch (SQLException e) {
			System.err.println(e);
			return false;
		}finally {
			try {
				con.close();
			} catch (Exception e2) {
				System.err.println();
			}
		}
	}

	public void Deposito(int cantidad) {
		PreparedStatement pS = null;
		//Connection con = Conectar();
		
		//String sql = ""
		
		if(cantidad < 0)
			System.out.println("no es posible hacer el ingreso");
		else {
			System.out.println("el ingreso a sido exitoso");
			//setCantidad(this.cantidad += cantidad);
		}
	}
		
	public void Retiro(int cantidad)
	{
		/*if(cantidad < this.cantidad)
		{
			setCantidad(this.cantidad -= cantidad);
			System.out.println("el retiro ha sido exitosa");
		}else {
			System.out.println("sin fondos suficientes para realizar el  retiro");
		}*/
	}
	
	public void ConsultarSaldo() {
		//System.out.println("El saldo es: " + cantidad);
	}
}

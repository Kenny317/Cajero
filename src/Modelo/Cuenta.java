package Modelo;

public class Cuenta extends Conexion{

	// Cuenta
	private int cantidad = 500;
	
	// Usuarios
	private String nombre;
	private String apellido;
	private int id;
	private String telefono;
	private String correo;
	private String fechaNaci;
	private String contraseñaRegis;
	private String contraseña;
	
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFechaNaci() {
		return fechaNaci;
	}
	public void setFechaNaci(String fechaNaci) {
		this.fechaNaci = fechaNaci;
	}
	public String getcontraseñaRegis() {
		return contraseñaRegis;
	}
	public void setcontraseñaRegis(String contraseñaRegis) {
		this.contraseñaRegis = contraseñaRegis;
	}


}

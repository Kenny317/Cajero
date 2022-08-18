package Cajero;

import java.awt.Panel;
import java.util.Scanner;
import javax.swing.ScrollPaneLayout;

import Modelo.Cuenta;

public class Menu {

	private String usuario;
	private String claveDigitada;
	private String claveGenerada;

	Scanner sc = new Scanner(System.in);
	Cuenta cuenta = new Cuenta();
	
	public Menu() {
	                                 
		System.out.println("Bienvenidos al cajero");
		//TipoTransaccion();
	}
		
	public String Usuario (String usuario) {
		this.usuario = usuario;
		return this.usuario;
	}
		
	public String Clave(String clave) {
		
		StringBuilder sBuilder = new StringBuilder(usuario);
		StringBuilder reveBuilder = sBuilder.reverse();
			
		claveGenerada= reveBuilder.toString();
			
		if(clave.equals(claveGenerada)) {
			System.out.println("Clave Correcta");
			return "Clave correcta";
		}else {
			System.out.println("Clave incorrecta");
			return "Clave incorrecta";
		}
	}
		
	/*public void TipoTransaccion() {
		
		int tipo = 0;
			
	while(tipo < 5){
		System.out.println("Seleccione el tipo de transaccion que desea realizar");
		System.out.print("1: Retiro "+"\n"+"2: Recarga"+"\n"+"3: Consultar saldo"+"\n"+"4: salir de la aplicacion"+"\n" );
		tipo = sc.nextInt();
			
			
		switch (tipo) {
			
		case 1:
			System.out.println("Que cantidad desea realizar el retiro");
			cuenta.Retiro(sc.nextInt());
			break;
		case 2:
			System.out.println("Que cantidad desea realizar la recarga");
			cuenta.Deposito(sc.nextInt());
			break;
		
		case 3:
			cuenta.ConsultarSaldo();	
			break;
		
		case 4:
			System.out.println("Muchas gracias por utilizar este cajero digital");
			tipo = 5;
			break;
		}
		if(tipo != 5){
			System.out.println("\n"+"Desea realizar otra transaccion");
			System.out.println("Marcar 1 si quiere seguir" + "\n" + "Marcar 2 si quiere salir" );
			int rst = sc.nextInt();
			if(rst == 1)
				tipo = 0;
			else {
				System.out.println("muchas gracias por utilizar este cajero digital");
				tipo = 5;
			}
		}
	}
	}*/
}
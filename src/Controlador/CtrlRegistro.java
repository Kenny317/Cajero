package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Modelo.Consultas;
import Modelo.Cuenta;
import Vista.FormCajero;

public class CtrlRegistro implements ActionListener{

	private Cuenta cuen;
	private Consultas cons;
	private FormCajero formC;
	
	public CtrlRegistro (Cuenta cuen, Consultas cons, FormCajero formC ) {
		
		this.cuen = cuen;
		this.cons = cons;
		this.formC = formC;
		this.formC.btnGuardar.addActionListener(this);
		this.formC.btnRegistrar.addActionListener(this);
		this.formC.btnIngresar.addActionListener(this);
	}
	
	public void Iniciar()
	{
		formC.setTitle("Registro de cajero");
		formC.setLocationRelativeTo(null);
		formC.panel_Registro.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == formC.btnGuardar) {
			cuen.setNombre(formC.txtNombre.getText());
			cuen.setApellido(formC.txtApellido.getText());
			cuen.setId(Integer.parseInt(formC.txtCC.getText()));
			cuen.setTelefono(formC.txtTelefono.getText());
			cuen.setCorreo(formC.txtCorreo.getText());
			cuen.setFechaNaci(formC.getFecha(formC.dateChoFecha));
			System.out.println("fecha " + formC.getFecha(formC.dateChoFecha));
			cuen.setcontraseñaRegis(formC.txtContraseña.getText());
		
			if (cons.Registro(cuen)) {
				JOptionPane.showMessageDialog(null, "Registro guardado");
				formC.panel_Registro.setVisible(false);
				formC.panel_Ingreso.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null,"Error al guardar");
			}
		}
		if(e.getSource() == formC.btnIngresar) {

			cuen.setContraseña(formC.txtContraseñaLogin.getText());
			if(cons.Registro(cuen)) {
				//System.out.println("yess");
			}
		}
		if(e.getSource() == formC.btnRegistrar) {
			System.out.println("panel ingreso " + formC.panel_Ingreso.getVisibleRect());
			System.out.println("asdfasdf");
			formC.panel_Ingreso.setVisible(false);
			formC.panel_Registro.setVisible(true);
		
			
		}
		
		
	}

	
}

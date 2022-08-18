package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	}
	
	public void Iniciar()
	{
		formC.setTitle("Registro de cajero");
		formC.setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == formC.btnGuardar) {
			cuen.setNombre(formC.txtNombre.getText());
			cuen.setApellido(formC.txtApellido.getText());
			cuen.setId(Integer.parseInt( formC.txtCC.getText()));
			cuen.setTelefono(Integer.parseInt(formC.txtTelefono.getText()));
			cuen.setCorreo(formC.txtCorreo.getText());
			//cuen.setFechaNaci(formC.txtFechaDeNacimiento.getText());
		}
		
	}

	
}

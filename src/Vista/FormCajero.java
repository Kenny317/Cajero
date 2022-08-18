package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;

public class FormCajero extends JFrame {

	private JPanel contentPane;
	private JPanel panel_Registro = new JPanel();
	private JPanel panel_Ingreso = new JPanel();
	
	//panel Registro
	public JTextField txtNombre;
	public JTextField txtApellido;
	public JTextField txtCC;
	public JTextField txtTelefono;
	public JTextField txtCorreo;
	public JTextField txtCorreoLogin;
	public JTextField txtContraseña;
	public JButton btnGuardar = new JButton("Guardar");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCajero frame = new FormCajero();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormCajero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel_Registro.setVisible(false);
		

		panel_Registro.setBounds(0, 0, 436, 274);
		contentPane.add(panel_Registro);
		panel_Registro.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(33, 39, 49, 14);
		panel_Registro.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(33, 64, 49, 14);
		panel_Registro.add(lblApellido);
		
		JLabel lblCc = new JLabel("C.C.");
		lblCc.setBounds(33, 89, 49, 14);
		panel_Registro.add(lblCc);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(33, 114, 68, 14);
		panel_Registro.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(33, 139, 49, 14);
		panel_Registro.add(lblCorreo);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(33, 164, 131, 14);
		panel_Registro.add(lblFechaDeNacimiento);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(197, 36, 96, 20);
		panel_Registro.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(197, 61, 96, 20);
		panel_Registro.add(txtApellido);
		
		txtCC = new JTextField();
		txtCC.setColumns(10);
		txtCC.setBounds(197, 86, 96, 20);
		panel_Registro.add(txtCC);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(197, 111, 96, 20);
		panel_Registro.add(txtTelefono);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(197, 136, 96, 20);
		panel_Registro.add(txtCorreo);
		

		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panel_Ingreso.setVisible(true);
				//panel_Registro.setVisible(false);
			}
		});
		btnGuardar.setBounds(153, 208, 89, 23);
		panel_Registro.add(btnGuardar);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(197, 164, 96, 20);
		panel_Registro.add(dateChooser);
		
		
		panel_Ingreso.setBounds(0, 0, 436, 274);
		contentPane.add(panel_Ingreso);
		panel_Ingreso.setLayout(null);
		
		JLabel lblCorreoLogin = new JLabel("Correo");
		lblCorreoLogin.setBounds(60, 63, 49, 14);
		panel_Ingreso.add(lblCorreoLogin);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(60, 109, 78, 14);
		panel_Ingreso.add(lblContrasea);
		
		txtCorreoLogin = new JTextField();
		txtCorreoLogin.setBounds(212, 60, 96, 20);
		panel_Ingreso.add(txtCorreoLogin);
		txtCorreoLogin.setColumns(10);
		
		txtContraseña = new JTextField();
		txtContraseña.setColumns(10);
		txtContraseña.setBounds(212, 106, 96, 20);
		panel_Ingreso.add(txtContraseña);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(143, 152, 89, 23);
		panel_Ingreso.add(btnIngresar);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Registro.setVisible(true);
				panel_Ingreso.setVisible(false);
			}
		});
		btnRegistrar.setBounds(143, 186, 89, 23);
		panel_Ingreso.add(btnRegistrar);
	}
}

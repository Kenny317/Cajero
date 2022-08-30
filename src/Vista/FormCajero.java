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
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;

public class FormCajero extends JFrame {

	private JPanel contentPane;
	public JPanel panel_Registro = new JPanel();
	public JPanel panel_Ingreso = new JPanel();
	
	//panel Registro
	public JTextField txtNombre;
	public JTextField txtApellido;
	public JTextField txtTelefono;
	public JTextField txtCC;
	public JTextField txtCorreo;
	public JButton btnGuardar = new JButton("Guardar");
	public JDateChooser dateChoFecha = new JDateChooser();
	SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
	public JTextField txtContraseña;
	
	
	//panel ingreso
	public JTextField txtCorreoLogin = new JTextField();
	public JTextField txtContraseñaLogin = new JTextField();
	public JButton btnIngresar = new JButton("Ingresar");
	public JButton btnRegistrar = new JButton("Registrar");
	
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
		setBounds(100, 100, 445, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//panel ingreso
		panel_Ingreso.setBounds(0, 0, 431, 306);
		contentPane.add(panel_Ingreso);
		panel_Ingreso.setLayout(null);
		
		JLabel lblCorreoLogin = new JLabel("Correo");
		lblCorreoLogin.setBounds(60, 63, 49, 14);
		panel_Ingreso.add(lblCorreoLogin);
		
				txtCorreoLogin.setBounds(212, 60, 96, 20);
				txtCorreoLogin.setColumns(10);
				panel_Ingreso.add(txtCorreoLogin);
				
						JLabel lblContrasea = new JLabel("Contrase\u00F1a");
						lblContrasea.setBounds(60, 109, 78, 14);
						panel_Ingreso.add(lblContrasea);
						
						txtContraseñaLogin.setColumns(10);
						txtContraseñaLogin.setBounds(212, 106, 96, 20);
						panel_Ingreso.add(txtContraseñaLogin);
						
								btnIngresar.setBounds(143, 152, 89, 23);
								panel_Ingreso.add(btnIngresar);
								
								btnRegistrar.setBounds(153, 186, 89, 23);
								panel_Ingreso.add(btnRegistrar);
		
				
		//panel registro
					
		panel_Registro.setBounds(0, 0, 431, 306);
		panel_Registro.setLayout(null);
		contentPane.add(panel_Registro);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(33, 26, 49, 14);
		panel_Registro.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(197, 23, 96, 20);
		txtNombre.setColumns(10);
		panel_Registro.add(txtNombre);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(33, 53, 49, 14);
		panel_Registro.add(lblApellido);


		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(197, 50, 96, 20);
		panel_Registro.add(txtApellido);

		JLabel lblCc = new JLabel("C.C.");
		lblCc.setBounds(33, 80, 49, 14);
		panel_Registro.add(lblCc);

		JLabel lblContraseñaRegis = new JLabel("Contrase\u00F1a");
		lblContraseñaRegis.setBounds(33, 188, 68, 14);
		panel_Registro.add(lblContraseñaRegis);		
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(33, 161, 68, 14);
		panel_Registro.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(33, 107, 49, 14);
		panel_Registro.add(lblCorreo);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(33, 134, 131, 14);
		panel_Registro.add(lblFechaDeNacimiento);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(150, 231, 89, 23);
		panel_Registro.add(btnNewButton);
		
		txtCC = new JTextField();
		txtCC.setBounds(197, 77, 96, 20);
		panel_Registro.add(txtCC);
		txtCC.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(197, 104, 96, 20);
		panel_Registro.add(txtCorreo);
		
		dateChoFecha = new JDateChooser();
		dateChoFecha.setBounds(197, 128, 96, 20);
		panel_Registro.add(dateChoFecha);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(197, 158, 96, 20);
		txtTelefono.setColumns(10);
		panel_Registro.add(txtTelefono);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(197, 185, 96, 20);
		panel_Registro.add(txtContraseña);
		txtContraseña.setColumns(10);
							
			}
	
	public String getFecha (JDateChooser jd) {
		
		if(jd.getDate()!=null)
			return formato.format(jd.getDate());
		else 
			return null;
		
	}
}

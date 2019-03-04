import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrmCocaCola extends JFrame implements ActionListener
{
	JMenuBar 	mnb_menu;
	JMenu 		mnu_opciones, mnu_calcular, mnu_acerca, mnu_colorfondo;
	JMenuItem 	mni_rojo, mni_negro, mni_morado, 
				mni_nuevo, mni_salir, 
				mni_calculo,
				mni_creador;
	JLabel		lbl_logo, lbl_bienvenido, lbl_titulo,
				lbl_nombre, 	lbl_dpto,
				lbl_apellidop, 	lbl_antiguedad,
				lbl_apellidom,	lbl_resultado,
				lbl_footer;
	JTextField	txt_nombre, txt_apellidop, txt_apellidom;
	JComboBox	cbo_dpto, cbo_antiguedad;
	JScrollPane	pnl_resultado;
	JTextArea	txt_resultado;
	String      nombre_admin = "";
	
	public FrmCocaCola()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Titulo e Icono
		setTitle("Coca-Cola Calculo Vacaciones");
		getContentPane().setBackground(new Color(255, 0, 0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		
		FrmLogin frm_login = new FrmLogin();
		nombre_admin = frm_login.Usuario;
		
		
		// Crear Menu
		mnb_menu = new JMenuBar();
		mnb_menu.setBackground(new Color(255, 0, 0));
		setJMenuBar(mnb_menu);
		
		mnu_opciones = new JMenu("Opciones");
		mnu_opciones.setBackground(new Color (255, 0, 0));
		mnu_opciones.setFont(new Font("Andale Mono", 1, 14 ));
		mnu_opciones.setForeground(new Color (255, 255, 255));
		mnb_menu.add(mnu_opciones);

		mnu_calcular = new JMenu("Calcular");
		mnu_calcular.setBackground(new Color (255, 0, 0));
		mnu_calcular.setFont(new Font("Andale Mono", 1, 14 ));
		mnu_calcular.setForeground(new Color (255, 255, 255));
		mnb_menu.add(mnu_calcular);
		
		mnu_acerca = new JMenu("Acerca de");
		mnu_acerca.setBackground(new Color (255, 0, 0));
		mnu_acerca.setFont(new Font("Andale Mono", 1, 14 ));
		mnu_acerca.setForeground(new Color (255, 255, 255));
		mnb_menu.add(mnu_acerca);
		
		mnu_colorfondo = new JMenu("Color de fondo");
//		mnu_colorfondo.setBackground(new Color (255, 0, 0));
		mnu_colorfondo.setFont(new Font("Andale Mono", 1, 14 ));
		mnu_colorfondo.setForeground(new Color (255, 0, 0));
		mnu_opciones.add(mnu_colorfondo);
		
		mni_rojo = new JMenuItem("Rojo");
//		mni_rojo.setBackground(new Color (255, 0, 0));
		mni_rojo.setFont(new Font("Andale Mono", 1, 14 ));
		mni_rojo.setForeground(new Color (255, 0, 0));
		mnu_colorfondo.add(mni_rojo);
		mni_rojo.addActionListener(this);
		
		mni_negro = new JMenuItem("Negro");
//		mni_negro.setBackground(new Color (255, 0, 0));
		mni_negro.setFont(new Font("Andale Mono", 1, 14 ));
		mni_negro.setForeground(new Color (255, 0, 0));
		mnu_colorfondo.add(mni_negro);
		mni_negro.addActionListener(this);
		
		mni_morado = new JMenuItem("Morado");
//		mni_morado.setBackground(new Color (255, 0, 0));
		mni_morado.setFont(new Font("Andale Mono", 1, 14 ));
		mni_morado.setForeground(new Color (255, 0, 0));
		mnu_colorfondo.add(mni_morado);
		mni_morado.addActionListener(this);
		
		mni_nuevo = new JMenuItem("Nuevo");
//		mni_nuevo.setBackground(new Color (255, 0, 0));
		mni_nuevo.setFont(new Font("Andale Mono", 1, 14 ));
		mni_nuevo.setForeground(new Color (255, 0, 0));
		mnu_opciones.add(mni_nuevo);
		mni_nuevo.addActionListener(this);
		
		mni_salir = new JMenuItem("Salir");
//		mni_salir.setBackground(new Color (255, 0, 0));
		mni_salir.setFont(new Font("Andale Mono", 1, 14 ));
		mni_salir.setForeground(new Color (255, 0, 0));
		mnu_opciones.add(mni_salir);
		mni_salir.addActionListener(this);
		
		mni_calculo = new JMenuItem("Vacaciones");
//		mni_calculo.setBackground(new Color (255, 0, 0));
		mni_calculo.setFont(new Font("Andale Mono", 1, 14 ));
		mni_calculo.setForeground(new Color (255, 0, 0));
		mnu_calcular.add(mni_calculo);
		mni_calculo.addActionListener(this);
		
		mni_creador = new JMenuItem("El Creador");
//		mni_creador.setBackground(new Color (255, 0, 0));
		mni_creador.setFont(new Font("Andale Mono", 1, 14 ));
		mni_creador.setForeground(new Color (255, 0, 0));
		mnu_acerca.add(mni_creador);
		mni_creador.addActionListener(this);
		
		// Logo
		ImageIcon img_logo = new ImageIcon("images/logo-coca.png");
		lbl_logo = new JLabel(img_logo);
		lbl_logo.setBounds(5, 5, 250, 100);
		add(lbl_logo);
		
		// Etiquetas
		lbl_bienvenido = new JLabel("Bienvenido " + nombre_admin);
		lbl_bienvenido.setBounds(280, 30, 300, 50);
		lbl_bienvenido.setFont(new Font("Andale Mono", 1, 32 ));
		lbl_bienvenido.setForeground(new Color (255, 255, 255));		
		add(lbl_bienvenido);
		
		lbl_titulo = new JLabel("Datos del trabajador para el calculo de Vacaciones");
		lbl_titulo.setBounds(45, 140, 900, 25);
		lbl_titulo.setFont(new Font("Andale Mono", 0, 24 ));
		lbl_titulo.setForeground(new Color (255, 255, 255));		
		add(lbl_titulo);
		
		// Pedir Nombre
		lbl_nombre = new JLabel("Nombre completo:");
		lbl_nombre.setBounds(25, 188, 180, 25);
		lbl_nombre.setFont(new Font("Andale Mono", 1, 12 ));
		lbl_nombre.setForeground(new Color (255, 255, 255));		
		add(lbl_nombre);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(25, 213, 150, 25);
		txt_nombre.setBackground(new Color (254, 254, 254));
		txt_nombre.setFont(new Font("Andale Mono", 1, 14 ));
		txt_nombre.setForeground(new Color (255, 0, 0));		
		add(txt_nombre);
		
		// Pedir Apellido Paterno
		lbl_apellidop = new JLabel("Apellido Paterno:");
		lbl_apellidop.setBounds(25, 248, 180, 25);
		lbl_apellidop.setFont(new Font("Andale Mono", 1, 12 ));
		lbl_apellidop.setForeground(new Color (255, 255, 255));		
		add(lbl_apellidop);
		
		txt_apellidop = new JTextField();
		txt_apellidop.setBounds(25, 273, 150, 25);
		txt_apellidop.setBackground(new Color (254, 254, 254));
		txt_apellidop.setFont(new Font("Andale Mono", 1, 14 ));
		txt_apellidop.setForeground(new Color (255, 0, 0));		
		add(txt_apellidop);
		
		// Pedir Apellido Materno
		lbl_apellidom = new JLabel("Apellido Materno:");
		lbl_apellidom.setBounds(25, 308, 180, 25);
		lbl_apellidom.setFont(new Font("Andale Mono", 1, 12 ));
		lbl_apellidom.setForeground(new Color (255, 255, 255));		
		add(lbl_apellidom);
		
		txt_apellidom = new JTextField();
		txt_apellidom.setBounds(25, 334, 150, 25);
		txt_apellidom.setBackground(new Color (254, 254, 254));
		txt_apellidom.setFont(new Font("Andale Mono", 1, 14 ));
		txt_apellidom.setForeground(new Color (255, 0, 0));		
		add(txt_apellidom);
		
		// Pedir Departamento
		lbl_dpto = new JLabel("Selecciona el Departamento:");
		lbl_dpto.setBounds(220, 188, 180, 25);
		lbl_dpto.setFont(new Font("Andale Mono", 1, 12 ));
		lbl_dpto.setForeground(new Color (255, 255, 255));		
		add(lbl_dpto);
		
		cbo_dpto = new JComboBox();
		cbo_dpto.setBounds(220, 213, 220, 25);
		cbo_dpto.setBackground(new Color (224, 224, 224));
		cbo_dpto.setFont(new Font("Andale Mono", 1, 14 ));
		cbo_dpto.setForeground(new Color (255, 0, 0));		
		add(cbo_dpto);
		cbo_dpto.addItem("");
		cbo_dpto.addItem("Atencion al Cliente");
		cbo_dpto.addItem("Departamento de Logistica");
		cbo_dpto.addItem("Departamento de Gerencia");
		
		// Pedir Departamento
		lbl_antiguedad = new JLabel("Selecciona la Antiguedad:");
		lbl_antiguedad.setBounds(220, 248, 180, 25);
		lbl_antiguedad.setFont(new Font("Andale Mono", 1, 12 ));
		lbl_antiguedad.setForeground(new Color (255, 255, 255));		
		add(lbl_antiguedad);
		
		cbo_antiguedad = new JComboBox();
		cbo_antiguedad.setBounds(220, 273, 220, 25);
		cbo_antiguedad.setBackground(new Color (224, 224, 224));
		cbo_antiguedad.setFont(new Font("Andale Mono", 1, 14 ));
		cbo_antiguedad.setForeground(new Color (255, 0, 0));		
		add(cbo_antiguedad);
		cbo_antiguedad.addItem("");
		cbo_antiguedad.addItem("1 Anio de Servicio");
		cbo_antiguedad.addItem("2 a 6 anios de servicio");
		cbo_antiguedad.addItem("7 anios o mas de servicio");

		// Resultado
		lbl_resultado = new JLabel("Resultado:");
		lbl_resultado.setBounds(220, 307, 180, 25);
		lbl_resultado.setFont(new Font("Andale Mono", 1, 12 ));
		lbl_resultado.setForeground(new Color (255, 255, 255));		
		add(lbl_resultado);
		
		txt_resultado = new JTextArea();
		txt_resultado.setEditable (false);
		txt_resultado.setBackground(new Color(224, 224, 224));
		txt_resultado.setFont(new Font("Andale Mono", 1, 14 ));
		txt_resultado.setForeground(new Color (255, 0, 0));
		txt_resultado.setText("\n   Aqui aparece el resultado del calculo de las vacaciones");
		pnl_resultado = new JScrollPane(txt_resultado);
		pnl_resultado.setBounds(220, 333, 385, 90);
		add(pnl_resultado);
		
		// Footer
		lbl_footer = new JLabel("2017 The Coca-Cola Company | Todos los derechos reservados");
		lbl_footer.setBounds(135, 445, 500, 30);
		lbl_footer.setFont(new Font("Andale Mono", 1, 12 ));
		lbl_footer.setForeground(new Color (255, 255, 255));		
		add(lbl_footer);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == mni_calculo)
		{
			String nombre_trabajador  	= txt_nombre.getText();
			String AP					= txt_apellidop.getText();
			String AM					= txt_apellidom.getText();
			String Departamento			= cbo_dpto.getSelectedItem().toString();
			String Antiguedad			= cbo_antiguedad.getSelectedItem().toString();
			
			if (nombre_trabajador.equals("") || 
				AP.equals("") || 
				AM.equals("") || 
				Departamento.equals("") || 
				Antiguedad.equals("") 
				)
			{
				JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos!");		
			}
			else
			{
				if (Departamento.equals("Atencion al Cliente"))
				{
					if (Antiguedad.equals("1 Anio de Servicio"))
					{
						txt_resultado.setText("\n El trabajador " + nombre_trabajador + " " + AP + " " + AM +
											  "\n quien labora en " + Departamento + " con " + Antiguedad +
											  "\n recibe 6 dias de vacaciones" +
											  "\n "
												);
					}
					if (Antiguedad.equals("2 a 6 anios de servicio"))
					{
						txt_resultado.setText("\n El trabajador " + nombre_trabajador + " " + AP + "" + AM +
											  "\n quien labora en " + Departamento + " con " + Antiguedad +
											  "\n recibe 14 dias de vacaciones" +
											  "\n "
												);
					}
					if (Antiguedad.equals("7 anios o mas de servicio"))
					{
						txt_resultado.setText("\n El trabajador " + nombre_trabajador + " " + AP + "" + AM +
											  "\n quien labora en " + Departamento + " con " + Antiguedad +
											  "\n recibe 20 dias de vacaciones" +
											  "\n "
												);
					}
				}
				else if (Departamento.equals("Departamento de Logistica"))
				{
					if (Antiguedad.equals("1 Anio de Servicio"))
					{
						txt_resultado.setText("\n El trabajador " + nombre_trabajador + " " + AP + "" + AM +
											  "\n quien labora en " + Departamento + " con " + Antiguedad +
											  "\n recibe 7 dias de vacaciones" +
											  "\n "
												);
					}
					if (Antiguedad.equals("2 a 6 anios de servicio"))
					{
						txt_resultado.setText("\n El trabajador " + nombre_trabajador + " " + AP + "" + AM +
											  "\n quien labora en " + Departamento + " con " + Antiguedad +
											  "\n recibe 15 dias de vacaciones" +
											  "\n "
												);
					}
					if (Antiguedad.equals("7 anios o mas de servicio"))
					{
						txt_resultado.setText("\n El trabajador " + nombre_trabajador + " " + AP + "" + AM +
											  "\n quien labora en " + Departamento + " con " + Antiguedad +
											  "\n recibe 22 dias de vacaciones" +
											  "\n "
												);
					}
				}
				else if (Departamento.equals("Departamento de Gerencia"))
				{
					if (Antiguedad.equals("1 Anio de Servicio"))
					{
						txt_resultado.setText("\n El trabajador " + nombre_trabajador + " " + AP + "" + AM +
											  "\n quien labora en " + Departamento + " con " + Antiguedad +
											  "\n recibe 10 dias de vacaciones" +
											  "\n "
												);
					}
					if (Antiguedad.equals("2 a 6 anios de servicio"))
					{
						txt_resultado.setText("\n El trabajador " + nombre_trabajador + " " + AP + "" + AM +
											  "\n quien labora en " + Departamento + " con " + Antiguedad +
											  "\n recibe 20 dias de vacaciones" +
											  "\n "
												);
					}
					if (Antiguedad.equals("7 anios o mas de servicio"))
					{
						txt_resultado.setText("\n El trabajador " + nombre_trabajador + " " + AP + "" + AM +
											  "\n quien labora en " + Departamento + " con " + Antiguedad +
											  "\n recibe 30 dias de vacaciones" +
											  "\n "
												);
					}
				}
			}
		}
		if (e.getSource() == mni_rojo)
		{
			getContentPane().setBackground(new Color(255, 0, 0));
		}
		if (e.getSource() == mni_negro)
		{
			getContentPane().setBackground(new Color(0, 0, 0));
		}
		if (e.getSource() == mni_morado)
		{
			getContentPane().setBackground(new Color(51, 0, 51));
		}
		if (e.getSource() == mni_nuevo)
		{
			txt_nombre.setText("");
			txt_apellidop.setText("");
			txt_apellidom.setText("");
			cbo_dpto.setSelectedIndex(0);
			cbo_antiguedad.setSelectedIndex(0);
			txt_resultado.setText("\n   Aqui aparece el resultado del calculo de las vacaciones");
			
		}
		if (e.getSource() == mni_salir)
		{
			System.exit(0);
		}
		if (e.getSource() == mni_creador)
		{
			JOptionPane.showMessageDialog(null, "Desarrollado por ajir77\n Aprendiendo Java");
		}
	}
	
	public static void main(String args[])
	{
		FrmCocaCola frm_cocacola = new FrmCocaCola();
		frm_cocacola.setBounds(0,0,640,535);
		frm_cocacola.setVisible(true);
		frm_cocacola.setResizable(false);
		frm_cocacola.setLocationRelativeTo(null);
	}
}
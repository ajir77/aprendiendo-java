import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class FrmLicencia extends JFrame implements ActionListener, ChangeListener
{
  JLabel      lbl_terminos, 
              lbl_cocacola;              

  JScrollPane pnl_terminos;
  JTextArea   txt_terminos;
  
  JCheckBox   chk_aceptar;
  JButton     btn_si_acepto,
              btn_no_acepto;
  
  public FrmLicencia()
  {
    setLayout(null);
    // Titulo e Icono
    setTitle("Licencia de Uso");
    setIconImage(new ImageIcon( getClass().getResource("images/icon.png")).getImage());
    
    // Logo
	ImageIcon img_logo = new ImageIcon("images/coca-cola.png");
	lbl_cocacola = new JLabel(img_logo);
    lbl_cocacola.setBounds( 315, 135, 300, 300 );
    add(lbl_cocacola);

    // Etiqueta
    lbl_terminos = new JLabel("TERMINOS Y CONDICIONES");
    lbl_terminos.setBounds( 215, 5, 200, 30 );
    lbl_terminos.setFont(new Font("Andale Mono", 1, 14));
    lbl_terminos.setForeground(new Color(0, 0, 0));
    add(lbl_terminos);
    
    // TextArea
	txt_terminos = new JTextArea();
	txt_terminos.setEditable(false);
	txt_terminos.setFont(new Font("Andale Mono", 0, 9) );
	txt_terminos.setText("\n\n          TERMINOS Y CONDICIONES" +
						 "\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DEL AUTOR." +
						 "\n\n          B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISENO DE LAS INTERFACES GRAFICAS." +
						 "\n\n          C. NOSOTROS NO NOS HACEMOS RESPONSABLES DEL MAL USO DE ESTE SOFTWARE." +
						 "\n\n          " +
						 "\n\n          los acuerdos legales expuestos a continuacion rigen el uso que usted haga de este software" +
						 "\n\n          " +
						 "\n\n          " +
						 "\n\n          " +
						 "\n\n          " +
						 "\n\n          Para mayor informacion sobre nuestros productos y servicios, por favor visite" +
						 "\n\n          http://www.youtube.com/ernestoperezm" +
						 "\n\n          " +
						 "\n\n          " );
	pnl_terminos = new JScrollPane(txt_terminos);
    pnl_terminos.setBounds(10,40,575,200);
    add(pnl_terminos);
	
	
    // Checkbox
	chk_aceptar = new JCheckBox("Yo Acepto");
	chk_aceptar.setBounds(10,250,300,30);
	//chk_aceptar.setFont(new Font("Andale Mono", 3, 18));
    chk_aceptar.addChangeListener(this);
	add(chk_aceptar);
	
    // Botones
    btn_si_acepto = new JButton("Continuar");
    btn_si_acepto.setBounds(20,290,100,30);
    //btn_si_acepto.setFont(new Font("Andale Mono", 1, 14));
    //btn_si_acepto.setForeground(new Color(255, 0, 0));
    btn_si_acepto.addActionListener(this);
	btn_si_acepto.setEnabled(false);
    add(btn_si_acepto);

    btn_no_acepto = new JButton("No Acepto");
    btn_no_acepto.setBounds(120,290,100,30);
    //btn_no_acepto.setFont(new Font("Andale Mono", 1, 14));
    //btn_no_acepto.setForeground(new Color(255, 0, 0));
    btn_no_acepto.addActionListener(this);
	btn_no_acepto.setEnabled(true);
    add(btn_no_acepto);
    
	
	
  }
  
  public void stateChanged(ChangeEvent e)
  {
    btn_no_acepto.setEnabled(!chk_aceptar.isSelected());
    btn_si_acepto.setEnabled(chk_aceptar.isSelected());	
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if ( e.getSource() == btn_no_acepto)
    {
      System.exit(0);
    }
    if ( e.getSource() == btn_si_acepto)
    {
      //System.exit(0);
    }
	
  }
  
  
  public static void main(String args[])
  {
    FrmLicencia frm_licencia = new FrmLicencia();
    frm_licencia.setBounds(0,0,630,400);
	frm_licencia.setVisible(true);
    //frm_licencia.setResizable(false);
	frm_licencia.setLocationRelativeTo(null);
	
  }
}
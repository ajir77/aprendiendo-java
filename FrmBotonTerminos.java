import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class FrmBotonTerminos extends JFrame implements ActionListener, ChangeListener
{
  private JLabel      lbl_terminos;
  private JCheckBox   chk_aceptar;
  private JButton     btn_aceptar;
  
  public FrmBotonTerminos()
  {
    setLayout(null);
    
    // Crear Labels
    lbl_terminos = new JLabel ("Aceptar los terminos y condiciones");
    lbl_terminos.setBounds(10,10,400,20);
    add(lbl_terminos);
    
    // Crear CheckBox
    chk_aceptar = new JCheckBox("Acepto");
    chk_aceptar.setBounds(10,50,100,30);
    chk_aceptar.addChangeListener(this);
    add(chk_aceptar);
    
    // Crear Boton
    btn_aceptar = new JButton("Continuar");
    btn_aceptar.setBounds(10,90,100,30);
    add(btn_aceptar);
    btn_aceptar.addActionListener(this);
    btn_aceptar.setEnabled(false);
    
  }
  
  public void stateChanged(ChangeEvent e)
  {
    if ( e.getSource() == chk_aceptar )
    {
      btn_aceptar.setEnabled( chk_aceptar.isSelected() );
    }
  }

  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == btn_aceptar)
    {
      System.exit(0);
    }
  }
  
  public static void main(String args[])
  {
    FrmBotonTerminos frm_ppal = new FrmBotonTerminos();
    frm_ppal.setBounds(0,0,450,300);
    frm_ppal.setVisible(true);
    frm_ppal.setResizable(false);
    frm_ppal.setLocationRelativeTo(null);
    
  }
}
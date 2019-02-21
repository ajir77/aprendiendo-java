import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
  private JTextField  txt_usuario;
  private JLabel      lbl_usuario;
  private JButton     btn_aceptar;
  
  public Login()
  {
    setLayout(null);
    
    // Crear etiquetas 
    lbl_usuario = new JLabel ("Usuario:");
    lbl_usuario.setBounds(10,10,100,30);
    add(lbl_usuario);
    
    // Crear Textos
    txt_usuario = new JTextField();
    txt_usuario.setBounds(120,17,150,20);
    add(txt_usuario);
    
    // Crear Botones
    btn_aceptar = new JButton("Aceptar");
    btn_aceptar.setBounds(10,80,100,30);
    add(btn_aceptar);
    btn_aceptar.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == btn_aceptar)
    {
      String ls_texto = txt_usuario.getText();
      setTitle(ls_texto);
      txt_usuario.setText("");
    }
  }
  
  public static void main(String args[])
  {
    Login frm_login = new Login();
    frm_login.setBounds(0,0,300,150);
    frm_login.setVisible(true);
    frm_login.setResizable(false);
    frm_login.setLocationRelativeTo(null);
  }
}

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FrmLogin extends JFrame implements ActionListener
{
  private JTextField txt_user;
  private JLabel lbl_cocacola, lbl_sistema, lbl_nombre, lbl_copyrigth;
  private JButton btn_ingresar;
  
  public FrmLogin()
  {
    setLayout(null);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color (255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    
    // Crear Labels
    ImageIcon img_logo = new ImageIcon("images/logo-coca.png");
    lbl_cocacola = new JLabel(img_logo);
    lbl_cocacola.setBounds(25,15,300,150);
    add(lbl_cocacola);
    
    lbl_sistema = new JLabel("Sistema de Control Vacacional");
    lbl_sistema.setBounds(35,135,300,30);
    lbl_sistema.setFont(new Font("Andale Mono", 3, 18));
    lbl_sistema.setForeground(new Color(255, 255, 255));
    add(lbl_sistema);
    
    lbl_nombre = new JLabel("Dame tu nombre");
    lbl_nombre.setBounds(45,212,200,30);
    lbl_nombre.setFont(new Font("Andale Mono", 1, 12));
    lbl_nombre.setForeground(new Color(255, 255, 255));
    add(lbl_nombre);

    lbl_copyrigth = new JLabel("CopyRigth 2017 The Coca-Cola Company");
    lbl_copyrigth.setBounds(85,375,300,30);
    lbl_copyrigth.setFont(new Font("Andale Mono", 1, 12));
    lbl_copyrigth.setForeground(new Color(255, 255, 255));
    add(lbl_copyrigth);
    
    // Crear Text    
    txt_user = new JTextField();
    txt_user.setBounds(45,240,255,25);
    txt_user.setBackground(new Color(200,200,200));
    txt_user.setFont(new Font("Andale Mono", 1, 12));
    txt_user.setForeground(new Color(255, 255, 255));    
    add(txt_user);
    
    
    // Crear Botones
    btn_ingresar = new JButton("Ingresar");
    btn_ingresar.setBounds(125,280,100,30);
    btn_ingresar.setFont(new Font("Andale Mono", 1, 14));
    btn_ingresar.setForeground(new Color(255, 0, 0));
    btn_ingresar.addActionListener(this);    
    add(btn_ingresar);
    
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if ( e.getSource() == btn_ingresar)
    {
      
    }
  }
  
  public static void main(String args[])
  {
    FrmLogin frm_login = new FrmLogin();
    frm_login.setBounds(0,0,350,450);
    frm_login.setVisible(true);
    frm_login.setResizable(false);
    frm_login.setLocationRelativeTo(null);
  }
  
}
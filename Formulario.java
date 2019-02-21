import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener
{
  private JButton btn_close;
  private JLabel lbl_name_app;
  private JLabel lbl_autor;
  private JLabel lbl_version;
  
  public Formulario()
  {
    setLayout(null);
    
    // Crear etiquetas
    lbl_name_app = new JLabel ("Curso de Java");
    lbl_name_app.setBounds(20,10,200,50);
    add(lbl_name_app);
    
    lbl_autor = new JLabel ("Ricardo Sepulveda");
    lbl_autor.setBounds(20,30,200,50);
    add(lbl_autor);

    lbl_version = new JLabel ("Version 1.0");
    lbl_version.setBounds(20,50,200,50);
    add(lbl_version);
    
    // Crear el boton de cerrar
    btn_close = new JButton("Cerrar");
    btn_close.setBounds(300,100,100,30);
    add(btn_close);
    btn_close.addActionListener(this);
    
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource()==btn_close)
    {
      System.exit(0);
    }
  }
  
  public static void main (String args[])
  {
    Formulario frm_Acercade = new Formulario();
    frm_Acercade.setBounds(0,0,450,350);
    frm_Acercade.setVisible(true);
    frm_Acercade.setResizable(false);
    frm_Acercade.setLocationRelativeTo(null);
  }
}

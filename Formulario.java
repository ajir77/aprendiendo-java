import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener
{
  private JButton btn_close;
  private JLabel lbl_name_app;
  private JLabel lbl_autor;
  private JLabel lbl_version;
  
  private JLabel lbl_texto;
  private JButton btn_1, btn_2, btn_3;
  
  
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

    lbl_texto = new JLabel ("Presione un Boton...");
    lbl_texto.setBounds(20,120,200,50);
    add(lbl_texto);
    
    // Crear el boton de cerrar
    btn_close = new JButton("Cerrar");
    btn_close.setBounds(300,100,100,30);
    add(btn_close);
    btn_close.addActionListener(this);
    
    btn_1 = new JButton("Opcion 1");
    btn_1.setBounds(10,180,90,30);
    add(btn_1);
    btn_1.addActionListener(this);
    
    btn_2 = new JButton("Opcion 2");
    btn_2.setBounds(110,180,90,30);
    add(btn_2);
    btn_2.addActionListener(this);

    btn_3 = new JButton("Opcion 3");
    btn_3.setBounds(210,180,90,30);
    add(btn_3);
    btn_3.addActionListener(this);    
  
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == btn_close)
    {
      System.exit(0);
    }
    else if (e.getSource() == btn_1)
    {
      lbl_texto.setText("Presionaste el boton 1");
    }
    else if (e.getSource() == btn_2)
    {
      lbl_texto.setText("Presionaste el boton 2");
    }
    else if (e.getSource() == btn_3)
    {
      lbl_texto.setText("Presionaste el boton 3");
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

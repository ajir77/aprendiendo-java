import javax.swing.*;
import java.awt.event.*;

public class Textos extends JFrame implements ActionListener
{
  private JTextField txt_texto;
  private JTextArea txt_text_area;
  private JScrollPane scp_scroll_pane;
  private JButton btn_aceptar;
  
  String texto = "";
  
  
  public Textos()
  {
    setLayout(null);
    
    // Crear Textos
    txt_texto = new JTextField();
    txt_texto.setBounds(10,10,200,30);
    add(txt_texto);
    
    txt_text_area = new JTextArea();
//    txt_text_area.setBounds(1,50,400,300);
//    add(txt_text_area);    
    scp_scroll_pane = new JScrollPane(txt_text_area);
    scp_scroll_pane.setBounds(1,50,400,300);
    add(scp_scroll_pane);
    
    // Crear Botones
    btn_aceptar = new JButton ("Aceptar");
    btn_aceptar.setBounds(250,10,150,30);
    add(btn_aceptar);
    btn_aceptar.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == btn_aceptar)
    {
      texto += txt_texto.getText() + "\n";
      txt_text_area.setText(texto);
      txt_texto.setText("");
    }
  }
  
  public static void main(String args[])
  {
    Textos frm_ppal = new Textos();
    frm_ppal.setBounds(0,0,540,400);
    frm_ppal.setVisible(true);
    frm_ppal.setResizable(false);
    frm_ppal.setLocationRelativeTo(null);
    // setTitle("Sumar");
  }
  
}
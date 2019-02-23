import javax.swing.*;
import java.awt.event.*;

public class Sumar extends JFrame implements ActionListener
{
  private JTextField  txt_num1, txt_num2;
  private JLabel      lbl_num1, lbl_num2, lbl_resultado;
  private JButton     btn_suma;
  
  public Sumar()
  {
    setLayout(null);
    // Crear Etiquetas
    lbl_num1 = new JLabel("Valor 1:");
    lbl_num1.setBounds(50,5,100,30);
    add(lbl_num1);
    
    lbl_num2 = new JLabel("Valor 2:");
    lbl_num2.setBounds(50, 35,100,30);
    add(lbl_num2);
    
    lbl_resultado = new JLabel("Resultado:");
    lbl_resultado.setBounds(120,80,100,30);
    add(lbl_resultado);
    
    
    // Crear Campos de Textos
    txt_num1 = new JTextField();
    txt_num1.setBounds(120,10,150,20);
    add(txt_num1);
    
    txt_num2 = new JTextField();
    txt_num2.setBounds(120,40,150,20);
    add(txt_num2);
    
    btn_suma = new JButton("Sumar");
    btn_suma.setBounds(10,80,100,30);
    add(btn_suma);
    btn_suma.addActionListener(this);
    
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == btn_suma)
    {
      int numero1 = 0, numero2 = 0, resultado = 0;
      
      numero1 = Integer.parseInt(txt_num1.getText());  
      numero2 = Integer.parseInt(txt_num2.getText());
      resultado = numero1 + numero2;
      
      lbl_resultado.setText("Resultado: " + resultado);
      
    }
  }
  
  public static void main(String args[])
  {
    Sumar frm_ppal = new Sumar();
    frm_ppal.setBounds(0, 0, 300, 150);
    frm_ppal.setVisible(true);
    frm_ppal.setResizable(false);
    frm_ppal.setLocationRelativeTo(null);
    
  }
  
}
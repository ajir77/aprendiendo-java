import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrmColor extends JFrame implements ActionListener
{
  private JLabel      lbl_rojo, lbl_verde, lbl_azul;
  private JComboBox   cbo_rojo, cbo_verde, cbo_azul;
  private JButton     btn_color;
  
  public FrmColor()
  {
    setLayout(null);
    
    // Crear Labels
    lbl_rojo = new JLabel("Rojo:");
    lbl_rojo.setBounds(10, 10, 100, 20);
    add(lbl_rojo);
    
    lbl_verde = new JLabel("Verde:");
    lbl_verde.setBounds(10, 40, 100, 20);
    add(lbl_verde);
    
    lbl_azul = new JLabel("Azul:");
    lbl_azul.setBounds(10, 70, 100, 20);
    add(lbl_azul);
    
    // crear combos
    cbo_rojo = new JComboBox();
    cbo_rojo.setBounds(120,10,50,30);
    add(cbo_rojo);
    for(int i = 0; i<256; i++)
    {
      cbo_rojo.addItem(String.valueOf(i));
    }  
    
    cbo_verde = new JComboBox();
    cbo_verde.setBounds(120, 50, 50, 30);
    add(cbo_verde);
    for(int i = 0; i<256; i++)
    {
      cbo_verde.addItem(String.valueOf(i));
    }  
    
    cbo_azul = new JComboBox();
    cbo_azul.setBounds(120, 90, 50, 30);
    add(cbo_azul);
    for(int i = 0; i<256; i++)
    {
      cbo_azul.addItem(String.valueOf(i));
    }  
    
    // crear botones
    btn_color = new JButton("Estabecer");
    btn_color.setBounds(10,130,100,30);
    add(btn_color);
    btn_color.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == btn_color)
    {
      String  ls_rojo  = cbo_rojo.getSelectedItem().toString();
      String  ls_verde = cbo_verde.getSelectedItem().toString();
      String  ls_azul  = cbo_azul.getSelectedItem().toString();
              
      int li_rojo  = Integer.parseInt(ls_rojo);    
      int li_verde = Integer.parseInt(ls_verde);
      int li_azul  = Integer.parseInt(ls_azul);
          
      Color color1 = new Color(li_rojo, li_verde, li_azul);

      btn_color.setBackground(color1);
    }
  }
  
  static public void main(String args[])
  {
    FrmColor frm_ppal = new FrmColor();
    frm_ppal.setBounds(0,0,200,200);
    frm_ppal.setVisible(true);
    frm_ppal.setResizable(false);
    frm_ppal.setLocationRelativeTo(null);
  }
}
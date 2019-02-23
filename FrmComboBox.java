import javax.swing.*;
import java.awt.event.*;

public class FrmComboBox extends JFrame implements ItemListener
{
  private JComboBox cbo_lista;
  
  public FrmComboBox()
  {
    setLayout(null);
    
    // Creacion Combo Box
    cbo_lista = new JComboBox();
    cbo_lista.setBounds(10, 10, 80, 20);
    add(cbo_lista);
    
    cbo_lista.addItem("Rojo");
    cbo_lista.addItem("Verde");
    cbo_lista.addItem("Azul");
    cbo_lista.addItem("Amarillo");
    cbo_lista.addItem("Negro");
    cbo_lista.addItemListener(this);
  }
  
  public void itemStateChanged(ItemEvent e)
  {
    if (e.getSource() == cbo_lista)
    {
      String Seleccion = cbo_lista.getSelectedItem().toString();
      setTitle(Seleccion);
    }
  }
  
  public static void main(String args[])
  {
    FrmComboBox frm_ppal = new FrmComboBox();
    frm_ppal.setBounds(0,0,350,200);
    frm_ppal.setVisible(true);
    frm_ppal.setResizable(false);
    frm_ppal.setLocationRelativeTo(null);
  }
  
}
import javax.swing.*;
import javax.swing.event.*;

public class FrmCheckBox extends JFrame implements ChangeListener
{
  private JCheckBox chk_ingles, chk_frances, chk_aleman;
  
  public FrmCheckBox()
  {
    setLayout(null);
    
    // Crear CheckBoxes
    chk_ingles = new JCheckBox("Ingles");
    chk_ingles.setBounds(10, 10, 150, 30);
    chk_ingles.addChangeListener(this);
    add(chk_ingles);
    
    chk_frances = new JCheckBox("Frances");
    chk_frances.setBounds(10, 50, 150, 30);
    chk_frances.addChangeListener(this);
    add(chk_frances);
    
    chk_aleman = new JCheckBox("Aleman");
    chk_aleman.setBounds(10, 90, 150, 30);
    chk_aleman.addChangeListener(this);
    add(chk_aleman);
    
  }
  
  public void stateChanged(ChangeEvent e)
  {
    String cad = "";
    if (chk_ingles.isSelected() == true)
    {
      cad = cad + "Ingles";
    }
    if (chk_frances.isSelected() == true)
    {
      if ( cad != "" ) cad = cad + " - ";
      cad = cad + "Frances";
    }
    if (chk_aleman.isSelected() == true)
    {
      if ( cad != "" ) cad = cad + " - ";
      cad = cad + "Aleman";
    }
    setTitle(cad);
  }
  
  public static void main(String args[])
  {
    FrmCheckBox frm_ppal = new FrmCheckBox();
    frm_ppal.setBounds(0,0,600,200);
    frm_ppal.setVisible(true);
    //frm_ppal.setResizable(false);
    frm_ppal.setLocationRelativeTo(null);
  }

}

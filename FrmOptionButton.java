import javax.swing.*;
import javax.swing.event.*;


public class FrmOptionButton extends JFrame implements ChangeListener
{
  private ButtonGroup rg_tamano;
  private JRadioButton rb_1, rb_2, rb_3;
  
  public FrmOptionButton()
  {
    setLayout(null);
    
    // Crear Grupo
    rg_tamano = new ButtonGroup();
    
    // Crear Radio Buttons
    rb_1 = new JRadioButton("640*480");
    rb_1.setBounds(10,20,100,30);
    rb_1.addChangeListener(this);
    add(rb_1);
    rg_tamano.add(rb_1);
    
    rb_2 = new JRadioButton("800*600");
    rb_2.setBounds(10,70,100,30);
    rb_2.addChangeListener(this);
    add(rb_2);
    rg_tamano.add(rb_2);

    rb_3 = new JRadioButton("1024*768");
    rb_3.setBounds(10,120,100,30);
    rb_3.addChangeListener(this);
    add(rb_3);
    rg_tamano.add(rb_3);
    
  }
  
  public void stateChanged(ChangeEvent e)
  {
    if (rb_1.isSelected())
    {
      setSize(640,480);
    }
    if (rb_2.isSelected())
    {
      setSize(800,600);
    }
    if (rb_3.isSelected())
    {
      setSize(1024,768);
    }
    
  }
  
  public static void main(String args[])
  {
    FrmOptionButton frm_ppal = new FrmOptionButton();
    frm_ppal.setBounds(0,0,350,230);
    frm_ppal.setVisible(true);
    frm_ppal.setResizable(false);
    //frm_ppal.setLocationRelativeTo(null);
  }
}
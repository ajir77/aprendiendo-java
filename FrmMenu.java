import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FrmMenu extends JFrame implements ActionListener
{
  private JMenuBar    menubar;
  private JMenu       mnu_opciones, mnu_archivo;
  private JMenuItem   mni_rojo, mni_verde, mni_azul, mni_salir;
  
  public FrmMenu()
  {
    setLayout(null);
    
    // Colocar la barra de menu
    menubar = new JMenuBar();
    setJMenuBar(menubar);
    
    // Crear menus
    mnu_archivo = new JMenu("Archivo");
    menubar.add(mnu_archivo);
    
    mnu_opciones = new JMenu("Opciones");
    menubar.add(mnu_opciones);
    
    // Crear Items de menu 
    mni_salir = new JMenuItem("Salir");
    mni_salir.addActionListener(this);
    mnu_archivo.add(mni_salir);

    mni_rojo = new JMenuItem("Rojo");
    mni_rojo.addActionListener(this);
    mnu_opciones.add(mni_rojo);
    
    mni_verde = new JMenuItem("Verde");
    mni_verde.addActionListener(this);
    mnu_opciones.add(mni_verde);
    
    mni_azul = new JMenuItem("Azul");
    mni_azul.addActionListener(this);
    mnu_opciones.add(mni_azul);
    
  }
  
  public void actionPerformed(ActionEvent e)
  {
    Container pnl_fondo = this.getContentPane();
    
    if (e.getSource() == mni_rojo)
    {
      pnl_fondo.setBackground(new Color(255,0,0));
    }
    if (e.getSource() == mni_verde)
    {
      pnl_fondo.setBackground(new Color(0,255,0));
    }
    if (e.getSource() == mni_azul)
    {
      pnl_fondo.setBackground(new Color(0,0,255));
    }
    if (e.getSource() == mni_salir)
    {
      System.exit(0);
    }
  }
  
  public static void main(String args[])
  {
    FrmMenu frm_ppal = new FrmMenu();
    frm_ppal.setBounds(0,0,400,300);
    frm_ppal.setVisible(true);
    frm_ppal.setLocationRelativeTo(null);
  }
}

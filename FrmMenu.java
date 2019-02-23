import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FrmMenu extends JFrame implements ActionListener
{
  private JMenuBar    menubar;
  private JMenu       mnu_opciones, mnu_archivo, mnu_tamano, mnu_color;
  private JMenuItem   mni_rojo, mni_verde, mni_azul, 
                      mni_300x200, mni_640x480,
                      mni_salir;
  
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
    
    mnu_tamano = new JMenu("Tamano de la ventana");
    mnu_opciones.add(mnu_tamano);
    
    mnu_color = new JMenu("Color de fondo");
    mnu_opciones.add(mnu_color);

    
    // Crear Items de menu 
    mni_salir = new JMenuItem("Salir");
    mni_salir.addActionListener(this);
    mnu_archivo.add(mni_salir);

    mni_rojo = new JMenuItem("Rojo");
    mni_rojo.addActionListener(this);
    mnu_color.add(mni_rojo);
    
    mni_verde = new JMenuItem("Verde");
    mni_verde.addActionListener(this);
    mnu_color.add(mni_verde);
    
    mni_azul = new JMenuItem("Azul");
    mni_azul.addActionListener(this);
    mnu_color.add(mni_azul);
    
    mni_300x200 = new JMenuItem("300 * 200");
    mni_300x200.addActionListener(this);
    mnu_tamano.add(mni_300x200);

    mni_640x480 = new JMenuItem("640 * 480");
    mni_640x480.addActionListener(this);
    mnu_tamano.add(mni_640x480);
    
}
  
  public void actionPerformed(ActionEvent e)
  {
   
    if (e.getSource() == mni_salir)
    {
      System.exit(0);
    }
    if (e.getSource() == mni_300x200)
    {
      setSize(300, 200);
    }
    if (e.getSource() == mni_640x480)
    {
      setSize(640, 480);
    }
    if (e.getSource() == mni_rojo)
    {
      getContentPane().setBackground(new Color(255,0,0));
    }
    if (e.getSource() == mni_verde)
    {
      getContentPane().setBackground(new Color(0,255,0));
    }
    if (e.getSource() == mni_azul)
    {
      getContentPane().setBackground(new Color(0,0,255));
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

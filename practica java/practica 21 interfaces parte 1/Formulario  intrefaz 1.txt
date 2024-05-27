import javax.swing.*;

public class Formulario extends JFrame{
  private JLabel gabriel;
   
  public Formulario(){
   setLayout(null);
   gabriel = new JLabel("El primer interfas gabriel");
   gabriel.setBounds(10,20,200,300);
   add(gabriel);
  }

  public static void main(String args[]){
   Formulario formulario1 = new Formulario();
   formulario1.setBounds(0,0,400,300);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
  }
}
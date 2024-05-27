import java.util.Scanner;

public class Login{
  public static void main(String args[]){

  String usuario = "", password = "";
  Scanner entrada = new Scanner(System.in);

  System.out.print("Ingresa tu nombre de usuario: ");
  usuario = entrada.nextLine();

  System.out.print("Ingresa tu contraseña: ");
  password = entrada.nextLine();

  if(usuario.equals("gabriel") && password.equals("27479490")){
   System.out.println("Inicio de sesion es correcto");
  } else {
      System.out.println("Nombre de usuario o contraseña incorrectos");
  }
 }
}

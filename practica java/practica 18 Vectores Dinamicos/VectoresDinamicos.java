import java.util.Scanner;

public class VectoresDinamicos{
  public static void main(String args[]){

  int longitud = 0;
  Scanner entrada = new Scanner(System.in);

  System.out.println("¿cuantos terminos quieres ingresar?");
  longitud = entrada.nextInt();

  int numeros[] = new int[longitud];

  for(int i = 0; i < numeros.length; i++){
   System.out.println("debes ingrersar el termino #" + (i + 1));
   numeros[i] = entrada.nextInt();
  }
  for(int i = 0; i < numeros.length; i++){
   System.out.print("[" + numeros[i] + "]");
  }
 }
}
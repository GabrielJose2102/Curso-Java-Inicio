import java.util.Scanner;

public class Precio{
  public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  int cantidad = 0, porcentaje = 0, resultado = 0, precio = 0;

  System.out.println("Dame la cantidad");
  cantidad = in.nextInt();

  System.out.println("¿Cual es el porcentaje de descuento?");
  porcentaje = in.nextInt();

   resultado = (cantidad * porcentaje) / 100;

  precio = cantidad - resultado;

  System.out.println("El precio a pagar es: " + precio);
 }
}
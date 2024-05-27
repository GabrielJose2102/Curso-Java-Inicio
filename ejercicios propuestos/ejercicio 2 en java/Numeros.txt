import java.util.Scanner;

public class Numeros{
  public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  int numero1, numero2, resultado1, resultado2;

  System.out.println("***************************************************************************");
  System.out.println("***********Bienvenido vamos a realizar operaciones matematicas***********");
  System.out.println("***************************************************************************");

  System.out.println("Dame el primer numero");
  numero1 = in.nextInt(); 

  System.out.println("Dame el segundo numero");
  numero2 = in.nextInt();

  resultado1 = numero1 * numero2;

  System.out.println("El resultado de la multiplicacion es" + resultado1);

  System.out.println("Vamos con la segunda operacion");


  resultado2 = numero1 / numero2;

  System.out.println("el resultado de la division es" + resultado2);
 }
}
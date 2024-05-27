import java.util.Scanner;

public class FechaDeNacimiento{
  public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  int año = 0, edad = 0, nacio = 0;

  System.out.println("Dime el año actual");
  año = in.nextInt();

  System.out.println("dime tu edad");  
  edad = in.nextInt();

  nacio = año - edad;

  System.out.println("Tu año de nacimiento es: " + nacio);
 }
}
import java.util.Scanner;

public class FechaDeNacimiento{
  public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  int a�o = 0, edad = 0, nacio = 0;

  System.out.println("Dime el a�o actual");
  a�o = in.nextInt();

  System.out.println("dime tu edad");  
  edad = in.nextInt();

  nacio = a�o - edad;

  System.out.println("Tu a�o de nacimiento es: " + nacio);
 }
}
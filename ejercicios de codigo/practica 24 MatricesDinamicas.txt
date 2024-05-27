import java.util.Scanner;

public class MatricesDinamicas{
 public static void main(String args[]){

  int filas = 0, columnas = 0, contador = 1;
  Scanner entrada = new Scanner(System.in);

  System.out.println("¿cuantas filas quieres");
  filas = entrada.nextInt();

  System.out.println("¿cuantas columnas quieres?");
  columnas = entrada.nextInt();

  int matriz[][] = new int [filas][columnas];

  for(int j = 0; j < filas; j++){
   for(int i = 0; i < columnas; i++){
      matriz[j][i] = contador;
      contador++;
      System.out.print("[" + matriz[j][i] + "]");
    }
     System.out.println("");
   }  
 }
}
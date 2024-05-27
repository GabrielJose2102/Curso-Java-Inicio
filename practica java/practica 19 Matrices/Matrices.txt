public class Matrices{
 public static void main(String args[]){

  int numeros [][] = new int [3][3];

  numeros [0][0] = 1; 
  numeros [0][1] = 0;
  numeros [0][2] = 0;
  numeros [1][0] = 0;
  numeros [1][1] = 1;
  numeros [1][2] = 0;
  numeros [2][0] = 0;
  numeros [2][1] = 0;
  numeros [2][2] = 1;

  System.out.print("[" + numeros [0][0] + "]");
  System.out.print("[" + numeros [0][1] + "]");
  System.out.println("[" + numeros [0][2] + "]");
  System.out.print("[" + numeros [1][0] + "]");
  System.out.print("[" + numeros [1][1] + "]");
  System.out.println("[" + numeros [1][2] + "]");
  System.out.print("[" + numeros [2][0] + "]");
  System.out.print("[" + numeros [2][1] + "]");
  System.out.print("[" + numeros [2][2] + "]");
 }
}
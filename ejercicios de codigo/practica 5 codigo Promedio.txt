public class Promedio{ 
  public static void main(String args[]){ 

   int matematica = 5;
   int biologia = 5;
   int quimica = 5;
   int promedio = 0;

   promedio = (matematica + biologia + quimica) / 3;

   if(promedio >= 6){ 
     System.out.println("El alumno aprobo " + promedio);
   } else { 
     System.out.println("El alumno reprobo " + promedio);
   } 
 }
}
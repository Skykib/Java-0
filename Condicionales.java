public class Condicionales{
 public static void main(String  args[]){
  
  int Mat =  5, Bio = 8, Qui = 7, promedio = 0;
  
  promedio = (Mat + Bio + Qui) / 3;

    if(promedio >= 6){
       System.out.println("Calificacion aprobatoria");
    }else{
      System.out.println("Calificacion no aprobatoria");
     }
	System.out.println("Promedio Final " + promedio);
 }
}

public class Operaciones{
  public static void main(String arg[]){
    
    int numUno = 4, numDos = 4, resultadoI = 0, resultadoC;
    
    resultadoI = numUno +  numDos / 2;
    
    //Prioridad de las operaciones
    resultadoC = (numUno + numDos) /2;

    System.out.println("4+4 /2 = 4 u 6?");
    
    System.out.println("Resultado incorrecto " + resultadoI );

    System.out.println("Resultado correcto " + resultadoC);
 }
}

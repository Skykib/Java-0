import java.util.Scanner;

public class CondicionalesAnidadas{

  public static void main(String args[]){
  
  Scanner in = new Scanner(System.in);

  int operacion = 0;
  int numUno = 0, numDos = 0;
  int resultado = 0;

	System.out.println("MI Calculadora Sencilla");
	System.out.println("Operaciones disponibles SUMA 1, RESTA 2, MULTIPLICACION 3, DIVICION 4 ");
	operacion = in.nextInt();
	System.out.println("ingresa la primera Cifra");
	numUno = in.nextInt();
	System.out.println("Ingresa la segunda Cifra");
	numDos = in.nextInt();

    if(operacion == 1){
     resultado = numUno + numDos;
	System.out.println("Resultado de la SUMA es " + resultado);
    }else if(operacion == 2){
     resultado = numUno - numDos;
	System.out.println("Resultado de la RESTA es " + resultado);
     }else if (operacion == 3){
     resultado = numUno * numDos;
        System.out.println("Resultado de la MULTIPLICACION es " + resultado);
      }else if (operacion == 4){
     resultado = numUno / numDos;
	System.out.println("Resultado de la DIVICION es " + resultado);
       }else{
	System.out.println("Tu Opcion es invalida");
        }
 }
}

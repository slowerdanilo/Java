package Exercicio1;

    // Fa�a um algoritmo que receba um n�mero e diga se este n�mero
    // est� no intervalo entre 100 e 200.

    import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
      //criando variavel
      int numero;
      
      //inicializando scanner (leia)
      Scanner leitorScanner = new Scanner(System.in);
      
      //guardando valor inteiro na vari�vel numero
      System.out.println("Digite um valor");
      numero = leitorScanner.nextInt();
      
      //se o numero for maior que 100 e menor que 200
      if(numero >= 100 && numero <= 200){
            System.out.println("O n�mero est� no intervalo");
      } else {
            System.out.println("O n�mero n�o est� no intervalo");
      }
      
      
        
    }
    
}

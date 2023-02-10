package Exercicio1;

    // Faça um algoritmo que receba um número e diga se este número
    // está no intervalo entre 100 e 200.

    import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
      //criando variavel
      int numero;
      
      //inicializando scanner (leia)
      Scanner leitorScanner = new Scanner(System.in);
      
      //guardando valor inteiro na variável numero
      System.out.println("Digite um valor");
      numero = leitorScanner.nextInt();
      
      //se o numero for maior que 100 e menor que 200
      if(numero >= 100 && numero <= 200){
            System.out.println("O número está no intervalo");
      } else {
            System.out.println("O número não está no intervalo");
      }
      
      
        
    }
    
}

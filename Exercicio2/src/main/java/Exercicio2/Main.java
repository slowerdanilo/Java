package Exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        int i = 0;
        for (; i < 3; i++) {
            
            System.out.println("Digite o nome do produto");
            nomeProduto = leitor.next();
            
            System.out.println("Digite o pre�o de custo do produto");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Digite o pre�o de venda do produto");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if (precoVenda == precoCusto) {
                System.out.println("Houve um empate entre o pre�o de custo e "
                        + "pre�o de venda");
            } else {
                if(precoCusto > precoVenda){
                   System.out.println("Preju�zo");
                } else {
                    System.out.println("Lucro");
                }
            }
            System.out.println(nomeProduto + ", pre�o de custo = " + precoCusto 
                    + ", pre�o de venda = " + precoVenda);
        }
        
        System.out.println("A m�dia do pre�o de custo � de: " + (totalCusto / i));
        
    }
    
}

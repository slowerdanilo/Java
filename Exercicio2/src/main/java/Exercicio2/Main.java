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
            
            System.out.println("Digite o preço de custo do produto");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Digite o preço de venda do produto");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if (precoVenda == precoCusto) {
                System.out.println("Houve um empate entre o preço de custo e "
                        + "preço de venda");
            } else {
                if(precoCusto > precoVenda){
                   System.out.println("Prejuízo");
                } else {
                    System.out.println("Lucro");
                }
            }
            System.out.println(nomeProduto + ", preço de custo = " + precoCusto 
                    + ", preço de venda = " + precoVenda);
        }
        
        System.out.println("A média do preço de custo é de: " + (totalCusto / i));
        
    }
    
}

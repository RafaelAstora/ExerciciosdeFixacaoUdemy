package ExerciciosDeFixacaoAplications;

import java.util.Scanner;

public class Aula37Exercicio05 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        //P indica preço
        Double EscolhaProduto,EscolhaQuantidade;
        Double CachorroQuenteP = 4.00,XSaladaP =4.50,XbaconP=5.00
        ,TorradaSimplesP=2.00, RefrigeranteP=1.50,TotalPagar;
        System.out.println("Escolha um produto pelo seu numero:\n1 CachorroQuente 4,00\n2 XSalada 4,50\n3 Xbacon 5,00 " +
                           "\n4 Torrada Simples 2,00\n5 Refrigerante 1,50 ");
        EscolhaProduto = sc.nextDouble();
        System.out.println("Qual a quantidade que gostaria de comprar deste item?");
        EscolhaQuantidade = sc.nextDouble();
        if (EscolhaProduto == 1){
            EscolhaProduto = 4.00;
        }else if(EscolhaProduto == 2){
            EscolhaProduto = 4.50;
        }else if(EscolhaProduto == 3){
            EscolhaProduto = 5.00;
        }else if(EscolhaProduto == 4){
            EscolhaProduto = 21.00;
        }else if(EscolhaProduto == 5){
            EscolhaProduto = 1.50;
        }else {
            System.out.println("Voce digitou algo errado");
            System.exit(0);
        }

        System.out.println("O total a pagar será de: " + EscolhaProduto * EscolhaQuantidade );
    }
}

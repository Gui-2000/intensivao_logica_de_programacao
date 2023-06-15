package listDeAtividade2;

import java.util.Random;

public class atividade3 {
    // 3. O valor unitário de um livro na promoção custa R$ 12,00, caso o cliente comprar até dez
    //livros. Caso contrário, o preço unitário do livro custa R$ 8,00. Escreva um algoritmo
    //que leia o número de livros comprados, calcule e mostre o valor total que o cliente deverá
    //pagar.
    public static void main(String[] args) {

        Random ram = new Random();
        int livrosComprados = ram.nextInt(2, 12 );
        double valorTotal;

        if (livrosComprados <= 10) {
            valorTotal = valorPago(livrosComprados, 12);
        } else {
            valorTotal = valorPago(livrosComprados, 8.00);
        }

        System.out.println("Valor da comprar: " + valorTotal);
    }

    public static double valorPago (int quantidade, double preco) {
        double valor = quantidade * preco;
        return valor;
    }
}

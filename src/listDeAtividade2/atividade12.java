package listDeAtividade2;

import java.util.Random;

public class atividade12 {
    //12. O cardápio de uma lanchonete é o seguinte:
    //LANCHE CÓDIGO VALOR
    //Cachorro Quente 101 1,20
    //Bauru Simples 102 1,30
    //Bauru com Ovo 103 1,50
    //Hamburger 104 1,20
    //Cheeseburger 105 1,30
    //Refrigerante 106 1,00
    //Escrever um algoritmo que leia o código do item pedido e a quantidade. Calcule o valor a
    //ser pago por aquele lanche. Considere que a cada execução somente será calculado um
    //item. Caso não seja informado algum código da lista, deve-se informar que o código do
    //lanche é inválido.
    public static void main(String[] args) {

        Random ram = new Random();
        int codigoDoItem = ram.nextInt(101, 110);
        int quantidadeDoItem = ram.nextInt(1, 5);

        if (codigoDoItem == 101) {
            double valorProduto = valorDoPedido(quantidadeDoItem, 1.20);
            System.out.println("Valor do Pedido: " + valorProduto);
        } else if (codigoDoItem == 102) {
            double valorProduto = valorDoPedido(quantidadeDoItem, 1.30);
            System.out.println("Valor do Pedido: " + valorProduto);
        } else if (codigoDoItem == 103) {
            double valorProduto = valorDoPedido(quantidadeDoItem, 1.50);
            System.out.println("Valor do Pedido: " + valorProduto);
        } else if (codigoDoItem == 104) {
            double valorProduto = valorDoPedido(quantidadeDoItem, 1.20);
            System.out.println("Valor do Pedido: " + valorProduto);
        } else if (codigoDoItem == 105) {
            double valorProduto = valorDoPedido(quantidadeDoItem, 1.30);
            System.out.println("Valor do Pedido: " + valorProduto);
        } else if (codigoDoItem == 106) {
            double valorProduto = valorDoPedido(quantidadeDoItem, 1.00);
            System.out.println("Valor do Pedido: " + valorProduto);
        } else {
            System.out.println("o código do lanche é inválido");
        }
    }
    public static double valorDoPedido (int quantidade, double preco) {
        double valor = quantidade * preco;
        return valor;
    }
}

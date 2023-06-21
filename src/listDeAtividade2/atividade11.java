package listDeAtividade2;

import java.util.Random;

public class atividade11 {
    //11. Elabore um algoritmo que tendo como entrada o preço e código de origem de um produto,
    //calcule e mostre na tela o valor do desconto concedido. Os códigos são os seguintes:
    //1 – região norte com desconto de 5%;
    //2 – região sul com desconto de 15%;
    //3 – região sudeste com desconto de 7%;
    //4 – região nordeste com desconto de 12% e
    //5 – região centro-oeste com desconto de 20%.
    //Caso não seja informado nenhum código valido informar na tela que o produto é importado.
    public static void main(String[] args) {

        Random ram = new Random();
        int codigos = ram.nextInt(1, 10);
        int precoProduto = ram.nextInt(1000, 1500);

        if (codigos == 1) {
            int produto = valorDesconto(precoProduto, 0.05);
            System.out.println("Região Norte preço do pruduto com desconto de 5%: " + produto);
        } else if (codigos == 2) {
            int produto = valorDesconto(precoProduto, 0.15);
            System.out.println("Região Sul preço do pruduto com desconto de 15%: " + produto);
        } else if (codigos == 3) {
            int produto = valorDesconto(precoProduto, 0.07);
            System.out.println("Região Sudeste preço do pruduto com desconto de 7%: " + produto);
        } else if (codigos == 4) {
            int produto = valorDesconto(precoProduto, 0.12);
            System.out.println("Região Nordeste preço do pruduto com desconto de 12%: " + produto);
        } else if (codigos == 5) {
            int produto = valorDesconto(precoProduto, 0.20);
            System.out.println("Região Centro-Oeste preço do pruduto com desconto de 20%: " + produto);
        } else {
            System.out.println("O produto é importado com preço sem desconto, valor: " + precoProduto);
        }
    }
    public static int valorDesconto (int preco, double porcentagemDoDesconto) {
        return (int) (preco - (preco * porcentagemDoDesconto));
    }
}

package listDeAtividade2;

import java.util.Random;

public class atividade7 {
    // 7. Uma lancheria está com alguns problemas para atender aos pedidos dos clientes. Não vai
    //ser possível atender pedidos que tenham algumas combinações do cardápio, são elas:
    //a) O lanche bauru não poderá ser acompanhado da bebida guaraná.
    //b) Se o cliente pedir X galinha, não poderá pedir água.
    //c) Quando o cliente pedir pizza, somente poderá beber vinho ou água.
    //Dessa forma, elabore um algoritmo que leia o lanche e a bebida e verifique se o pedido
    //poderá ser ou não atendido
    public static void main(String[] args) {

         int lancheBauro = 1;
         int XGalinha = 2;
         int pizza = 3;
         int guarana = 10;
         int agua = 11;
         int vinho = 12;

         Random ram = new Random();
         int lanche = ram.nextInt(1, 3);
         int bebida = ram.nextInt(10, 12);

         if (lanche == 1 && bebida == 10) {
             System.out.println("O pedido não poderá ser atendido");
         } else if (lanche == 2 && bebida == 11) {
             System.out.println("O pedido não poderá ser atendido");
         } else if (lanche == 3 && bebida == 10) {
             System.out.println("O pedido não poderá ser atendido");
         } else {
             System.out.println("Id da comida:" + lanche);
             System.out.println("Id da bebida:" + bebida);
             System.out.println("Pedido aceito");
         }
    }
}

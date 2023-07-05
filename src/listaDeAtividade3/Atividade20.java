package listaDeAtividade3;

public class Atividade20 {
    //20. Faça um algoritmo que leia um inteiro n e imprima um tabuleiro de xadrez ou damas com
    //lado n. Represente casas pretas por um "X"e casas brancas por um "O". Ex: n = 4
    //O X O X
    //X O X O
    //O X O X
    //X O X O
    public static void main(String[] args) {

        int n = 4;
        for (int i = 1; i <= n / 2; i++) {
            String casas = "O X O X";
            System.out.println(casas);
            char letra = casas.charAt(0);
            if (letra == 'O') {
                casas = "X O X O";
                System.out.println(casas);
            }
        }
    }
}

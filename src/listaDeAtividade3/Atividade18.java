package listaDeAtividade3;

public class Atividade18 {
    //18. Construa um algoritmo que mostre quatro zeros na tela, veja a saída abaixo:
    //***** ***** ***** *****
    //*   * *   * *   * *   *
    //*   * *   * *   * *   *
    //***** ***** ***** *****
    public static void main(String[] args) {

        String letra = "***** ***** ***** *****";
        System.out.println(letra);
        for (int i=0; i<2; i++) {
            letra = "*   * *   * *   * *   *" ;
            System.out.println(letra);
        }
        letra = "***** ***** ***** *****";
        System.out.println(letra);
    }
}

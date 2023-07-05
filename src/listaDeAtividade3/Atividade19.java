package listaDeAtividade3;

public class Atividade19 {
    //19. Construa um algoritmo que mostre a palavra IOIO na tela, veja a saida abaixo:
    //**** **** **** ****
    // **  *  *  **  *  *
    // **  *  *  **  *  *
    //**** **** **** ****
    public static void main(String[] args) {

        String letra = "**** **** **** ****";
        System.out.println(letra);
        for (int i=0; i<2; i++) {
            letra = " **  *  *  **  *  *" ;
            System.out.println(letra);
        }
        letra = "**** **** **** ****";
        System.out.println(letra);
    }
}

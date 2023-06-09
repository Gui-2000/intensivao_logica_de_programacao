package listaDeAtividade1;

public class Atividade7 {
     // 7. Com base na altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
    //usando a seguinte fórmula: (72.7 × altura) − 58.

    public static void main(String[] args) {

        double altura = 1.75 ;
        // Altura em metros

        int pesoIdeal = (int) ((72.7 * altura) - 58);

        System.out.println("Peso ideal : " + pesoIdeal + "Kg");
    }
}

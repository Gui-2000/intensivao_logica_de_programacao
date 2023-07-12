package colections_streams.exerciciosSet;


import java.util.HashSet;
import java.util.Set;

public class exercicio2 {
    //2:Imprima o SET, usando o FOR, sem ordem;
    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(3.5);
        notasAlunos.add(5.4);
        notasAlunos.add(8.6);
        notasAlunos.add(7.0);
        notasAlunos.add(10.0);
        notasAlunos.add(4.6);
        notasAlunos.add(8.5);
        notasAlunos.add(7.9);
        notasAlunos.add(6.0);
        notasAlunos.add(1.1);
        notasAlunos.add(9.5);

        for (Double nota : notasAlunos) {
            System.out.println("Nota: "+ nota);
        }
    }
}


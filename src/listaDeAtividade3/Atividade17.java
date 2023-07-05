package listaDeAtividade3;

public class Atividade17 {
    //17. Construa um algoritmo que mostre na tela:
    //*****
    //****
    //***
    //**
    //*
    public static void main(String[] args) {

        String letra = "*";
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf(letra);
            }
            System.out.println("");
        }
    }
}

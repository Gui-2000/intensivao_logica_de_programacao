package listaDeAtividade3;

import java.util.Random;

public class Atividade21 {
    //21. Faça um algoritmo que leia um inteiro n e imprima um triângulo com altura n. Ex: n = 5
    //*
    //***
    //*****
    //*******
    //*********
    public static void main(String[] args) {

        Random ram = new Random();
        int n = ram.nextInt(1, 10);
        String letra = "*";
        for (int i=0; i<n; i++) {
            System.out.println(letra);
            letra = letra + "**";
        }
    }
}

package org.example.ex04PooInstancias;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");

        String fraseUsuario = scanner.nextLine();

        Contador2 contador = new Contador2(fraseUsuario);

        int numeroPalavras = contador.contarPalavras();
        System.out.println("Número de palavras na frase: " + numeroPalavras);

        scanner.close();
    }

}



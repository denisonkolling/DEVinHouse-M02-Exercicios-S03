package org.example.ex03PooStatic;

import java.util.Scanner;

import static org.example.ex03PooStatic.Contador.contarPalavras;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");

        String fraseUsuario = scanner.nextLine();

        int numeroPalavras = contarPalavras(fraseUsuario);
        System.out.println("Número de palavras na frase: " + numeroPalavras);

        scanner.close();
    }
}


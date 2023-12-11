package org.example.ex03PooStatic;

public class Contador {

    public static int contarPalavras(String frase) {

        String[] palavras = frase.split("\\s+");

        return palavras.length;
    }
}

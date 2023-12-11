package org.example.ex04PooInstancias;

public class Contador2 {

    private String frase;


    public Contador2(String frase) {
        this.frase = frase;
    }

    public int contarPalavras() {
        String[] palavras = frase.split("\\s+");
        return palavras.length;
    }

}

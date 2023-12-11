package org.example.ex05MegaSena;

import java.time.LocalDate;
import java.util.Arrays;

public class Concurso {

    private Integer numero;
    private LocalDate data;
    private int[] sorteados;


    public Concurso() {
    }

    public Concurso(Integer numero, LocalDate data, int[] sorteados) {
        this.numero = numero;
        this.data = data;
        this.sorteados = sorteados;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int[] getSorteados() {
        return sorteados;
    }

    public void setSorteados(int[] sorteados) {
        this.sorteados = sorteados;
    }

    @Override
    public String toString() {
        return "Concurso " +
                "número " + numero +
                ", data " + data +
                ", números sorteados " + Arrays.toString(sorteados) +
                '}';
    }
}

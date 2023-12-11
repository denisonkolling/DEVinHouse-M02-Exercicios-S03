package org.example.ex05MegaSena;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) throws IOException{

        String caminhoArquivo = "C:/Users/PC/Desktop/megasena.csv";


        List<Concurso> concursos = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {

            String linha;

            while ((linha = br.readLine()) != null) {

                String[] split = linha.split(",");

                int nro = Integer.parseInt(split[0]);

                String dataString = split[1];
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate data = LocalDate.parse(dataString, formatador);

                int[] numerosSorteados = new int[6];
                for(int i=0; i<=5; i++) {
                    String n = split[i+2];
                    numerosSorteados[i] = Integer.parseInt(n);
                }

                Concurso concurso = new Concurso(nro, data, numerosSorteados);
                concursos.add(concurso);
            }

            concursos.forEach(c -> System.out.println(c));

        }
    }
}

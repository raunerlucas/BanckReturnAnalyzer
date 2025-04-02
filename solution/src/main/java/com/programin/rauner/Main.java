package com.programin.rauner;


import com.programin.rauner.model.LeituraRetornoBancoBrasil;
import com.programin.rauner.model.ProcessadorBoletos;

import java.net.URI;
import java.net.URISyntaxException;


public class Main {
    public static void main(String[] args) throws URISyntaxException {
        final var processador = new ProcessadorBoletos(new LeituraRetornoBancoBrasil());
        URI caminhoArquivo = Main.class.getClassLoader().getResource("banco-brasil-1.csv").toURI();
        System.out.println("Lendo arquivo " + caminhoArquivo + "\n");

        processador.processar(caminhoArquivo);
    }
}
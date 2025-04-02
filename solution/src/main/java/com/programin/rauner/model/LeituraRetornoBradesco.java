package com.programin.rauner.model;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBradesco implements LeituraRetorno {
    @Override
    public List<Boleto> lerArquivo(URI caminhoArquivo) {
        try {
            var listaLinhas = Files.readAllLines(Paths.get(caminhoArquivo));
            final var listaBoletos = new ArrayList<Boleto>();
            for (String linha : listaLinhas) {
//                3;002;1867;21401;23/12/2019;31/07/2019 16:02:32;12345678911;60.93;0;0

                final String[] vetor = linha.split(";");
                final var boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);
                boleto.setAgencia(vetor[2]);
                boleto.setContaBancaria(vetor[3]);
                // end::class-start[]

                boleto.setDataVencimento(LocalDate.parse(vetor[4], FORMATO_DATA));
                boleto.setDataPagamento(LocalDateTime.parse(vetor[5], FORMATO_DATA_HORA));

                boleto.setCpfCliente(vetor[6]);
                boleto.setValor(Double.parseDouble(vetor[7]));
                boleto.setMulta(Double.parseDouble(vetor[8]));
                boleto.setJuros(Double.parseDouble(vetor[9]));

                // tag::class-end[]
                listaBoletos.add(boleto);
            }

            return listaBoletos;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

package com.programin.rauner.model;

import java.util.Date;

public class BoletoBancoBrasil extends Boleto implements LeitorBoletos {
    private final Date boletoDataPagamento;

    public BoletoBancoBrasil(Integer boletoId, Integer boletoCodigoBanco, String boletoClienteCPF, Double boletoValor,
                             Double boletoJuros, Double boletoMulta, Date boletoData, Date boletoDataPagamento) {
        super(boletoId, boletoCodigoBanco, boletoClienteCPF, boletoValor, boletoJuros, boletoMulta, boletoData);
        this.boletoDataPagamento = boletoDataPagamento;
    }

    @Override
    public void lerBoleto() {

    }

    public Date getBoletoDataPagamento() {
        return boletoDataPagamento;
    }
}

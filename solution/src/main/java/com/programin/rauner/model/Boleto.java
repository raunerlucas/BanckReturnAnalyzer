package com.programin.rauner.model;

import java.util.Date;

public abstract class Boleto {
    private final Integer boletoId, boletoCodigoBanco;
    private final String boletoClienteCPF;
    private final Double boletoValor, boletoJuros, boletoMulta;
    private final Date boletoData;

    public Boleto(Integer boletoId, Integer boletoCodigoBanco, String boletoClienteCPF, Double boletoValor,
                  Double boletoJuros, Double boletoMulta, Date boletoData) {
        this.boletoId = boletoId;
        this.boletoCodigoBanco = boletoCodigoBanco;
        this.boletoClienteCPF = boletoClienteCPF;
        this.boletoValor = boletoValor;
        this.boletoJuros = boletoJuros;
        this.boletoMulta = boletoMulta;
        this.boletoData = boletoData;
    }


    public Integer getBoletoId() {
        return boletoId;
    }

    public Integer getBoletoCodigoBanco() {
        return boletoCodigoBanco;
    }

    public String getBoletoClienteCPF() {
        return boletoClienteCPF;
    }

    public Double getBoletoValor() {
        return boletoValor;
    }

    public Double getBoletoJuros() {
        return boletoJuros;
    }

    public Double getBoletoMulta() {
        return boletoMulta;
    }

    public Date getBoletoData() {
        return boletoData;
    }
}

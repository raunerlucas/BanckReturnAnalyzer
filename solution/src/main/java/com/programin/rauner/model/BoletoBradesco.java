package com.programin.rauner.model;

import java.util.Date;

public class BoletoBradesco extends Boleto implements LeitorBoletos {
    private final Date boletoDataHoraPagamento;
    private final Integer boletoAgencia, boletoContaCliente;

    public BoletoBradesco(Integer boletoId, Integer boletoCodigoBanco, String boletoClienteCPF, Double boletoValor, Double boletoJuros, Double boletoMulta, Date boletoData, Date boletoDataHoraPagamento, Integer boletoAgencia, Integer boletoContaCliente) {
        super(boletoId, boletoCodigoBanco, boletoClienteCPF, boletoValor, boletoJuros, boletoMulta, boletoData);
        this.boletoDataHoraPagamento = boletoDataHoraPagamento;
        this.boletoAgencia = boletoAgencia;
        this.boletoContaCliente = boletoContaCliente;
    }

    @Override
    public void lerBoleto() {

    }


    public Date getBoletoDataHoraPagamento() {
        return boletoDataHoraPagamento;
    }

    public Integer getBoletoAgencia() {
        return boletoAgencia;
    }

    public Integer getBoletoContaCliente() {
        return boletoContaCliente;
    }
}

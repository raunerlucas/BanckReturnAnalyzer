package com.programin.rauner.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BoletoBradesco extends Boleto implements LeitorBoletos {
    private final Date boletoDataHoraPagamento;
    private final Integer boletoAgencia, boletoContaCliente;

    public BoletoBradesco(Integer boletoId, Integer boletoCodigoBanco, String boletoClienteCPF, Double boletoValor,
                          Double boletoJuros, Double boletoMulta, Date boletoData, Date boletoDataHoraPagamento,
                          Integer boletoAgencia, Integer boletoContaCliente) {
        super(boletoId, boletoCodigoBanco, boletoClienteCPF, boletoValor, boletoJuros, boletoMulta, boletoData);
        this.boletoDataHoraPagamento = boletoDataHoraPagamento;
        this.boletoAgencia = boletoAgencia;
        this.boletoContaCliente = boletoContaCliente;
    }

    @Override
    public void lerBoleto() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nBoleto Bradesco")
                .append("\n\tBoleto ID => " + getBoletoId())
                .append("\n\tCódigo Banco => " + getBoletoCodigoBanco())
                .append("\n\tAgência Pagamento=> " + getBoletoAgencia())
                .append("\n\tConta Cliente => " + getBoletoContaCliente())
                .append("\n\tData Vencimento => " + getBoletoData())
                .append("\n\tData e Hora de Pagamento => " + getFormattedDate(boletoDataHoraPagamento))
                .append("\n\tCPF Cliente => " + getBoletoClienteCPF())
                .append("\n\tValor => " + getBoletoValor())
                .append("\n\tMulta => " + getBoletoMulta())
                .append("\n\tJuros => " + getBoletoJuros())
                .append("\n");
        System.out.println(stringBuilder);
    }


    private String getFormattedDate(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return dateFormat.format(date);
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
package com.programin.rauner.model;

import java.util.Date;

public class BoletoBancoBrasil extends Boleto implements LeitorBoletos {
    private final Date boletoDataPagamento;

    public BoletoBancoBrasil(Integer boletoId, Integer boletoCodigoBanco, Date boletoData, Date boletoDataPagamento,
                             String boletoClienteCPF, Double boletoValor, Double boletoMulta, Double boletoJuros) {
        super(boletoId, boletoCodigoBanco, boletoClienteCPF, boletoValor, boletoJuros, boletoMulta, boletoData);
        this.boletoDataPagamento = boletoDataPagamento;
    }

    @Override
    public void lerBoleto() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nBoleto Banco do Brasil")
                .append("\n\tBoleto ID => " + getBoletoId())
                .append("\n\tCódigo Banco => " + getBoletoCodigoBanco())
                .append("\n\tData Vencimento => " + getBoletoData())
                .append("\n\tData Pagamento => " + getBoletoDataPagamento())
                .append("\n\tCPF Cliente => " + getBoletoClienteCPF())
                .append("\n\tValor => " + getBoletoValor())
                .append("\n\tMulta => " + getBoletoMulta())
                .append("\n\tJuros => " + getBoletoJuros()).append("\n");
        System.out.println(stringBuilder);
    }

    public Date getBoletoDataPagamento() {
        return boletoDataPagamento;
    }
}

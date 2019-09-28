package br.newtonpaiva;

import java.math.BigDecimal;

public class Venda {
    private BigDecimal valorTotal;
    private boolean estorno;
    private TipoPagamento tipoPagamento;

    public Venda(BigDecimal valorTotal,
                 TipoPagamento tipoPagamento) {
        this.valorTotal = valorTotal;
        this.tipoPagamento = tipoPagamento;
    }

    public void fazEstorno() {
        if (estorno)
            throw new IllegalArgumentException("Venda já estornada!");
        estorno = true;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public boolean isEstorno() {
        return estorno;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
}

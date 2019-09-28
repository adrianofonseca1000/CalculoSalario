package br.newtonpaiva;

import java.math.BigDecimal;

public class CalculoSalarioTest {
    public static void main(String[] args) {
        Venda v1 = new Venda(new BigDecimal("100"),
                TipoPagamento.DINHEIRO);

        Venda v2 = new Venda(new BigDecimal("300"),
                TipoPagamento.DINHEIRO);

        Venda v3 = new Venda(new BigDecimal("200"),
                TipoPagamento.CARTAO_CREDITO);

        Venda v4 = new Venda(new BigDecimal("100"),
                TipoPagamento.DINHEIRO);
        v4.fazEstorno();

        Funcionario f = new Funcionario(111,
                "Teste",
                TipoFuncionario.VENDEDOR);

        f.addVenda(v1);
        f.addVenda(v2);
        f.addVenda(v3);
        f.addVenda(v4);

    }
}

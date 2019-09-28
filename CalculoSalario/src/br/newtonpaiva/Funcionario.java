package br.newtonpaiva;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private Integer codigo;
    private String nome;
    private TipoFuncionario tipo;
    private List<Venda> vendas;

    public Funcionario(Integer codigo, String nome, TipoFuncionario tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
    }

    public BigDecimal calcularSalario() {
        BigDecimal total = BigDecimal.ZERO;

        for (Venda v : this.vendas) {
            if (v.getTipoPagamento() == TipoPagamento.DINHEIRO &&
            !v.isEstorno())
                total = total.add(v.getValorTotal());
        }

        double comissao = total.doubleValue() *
                getTipo().getComissao() / 100;
    return new BigDecimal(comissao + getTipo().getSalario());
    }

    public void addVenda(Venda v) {
        if (this.vendas == null)
            this.vendas = new ArrayList<>();
        this.vendas.add(v);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
}

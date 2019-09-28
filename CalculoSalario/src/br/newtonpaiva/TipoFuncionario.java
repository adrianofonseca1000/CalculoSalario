package br.newtonpaiva;

public enum TipoFuncionario {
    VENDEDOR("Vendedor", 1200.0, 15.0),
    GERENTE("Gerente", 2200.0, 20.0),
    DIRETOR("Diretor", 5000.0, 0.0);

    private String label;
    private Double salario;
    private Double comissao;

    private TipoFuncionario(String label,
                            Double salario,
                            Double comissao) {
        this.label = label;
        this.salario = salario;
        this.comissao = comissao;
    }

    public String getLabel() {
        return label;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getComissao() {
        return comissao;
    }
}

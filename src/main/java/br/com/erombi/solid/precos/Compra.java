package br.com.erombi.solid.precos;

public class Compra {

    private Double valor;
    private String cidade;

    public Compra() {
    }

    public Compra(Double valor, String cidade) {
        this.valor = valor;
        this.cidade = cidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "valor=" + valor +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}

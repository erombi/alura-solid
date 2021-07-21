package br.com.erombi.solid.conta;

public class ContaDeEstudante {

    private ManipuladorDeSaldo manipulador;
    private int milhas;

    public ContaDeEstudante() {
        this.manipulador = new ManipuladorDeSaldo();
    }

    public int getMilhas() {
        return milhas;
    }

    public void saca(double valor) {
        manipulador.saca(valor);
    }

    public void deposita(double valor) {
        manipulador.deposita(valor);
        this.milhas += (int) valor;
    }
}

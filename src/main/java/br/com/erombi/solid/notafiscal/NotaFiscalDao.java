package br.com.erombi.solid.notafiscal;

public class NotaFiscalDao implements AcaoAposGerarNota{

    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}
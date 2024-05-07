package arvore;

public class No {

    private double valor;
    private No direita;
    private No esquerda;

    public No(double valor) {
        this.valor = valor;
        this.direita = null;
        this.esquerda = null;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

}

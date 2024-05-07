package arvore;

public class ArvoreBinaria {

    private No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void inserePrimeiroElemento(double valor) {
        No auxiliar = new No(valor);
        this.raiz = auxiliar;
    }

    public boolean arvoreVazia() {
        return (this.raiz == null);
    }

    public void insereElemento(double valor) {
        if (arvoreVazia()) {
            No auxiliar = new No(valor);
            this.raiz = auxiliar;
        } else {

            No temp = raiz;

            do {

                if (valor < temp.getValor()) {
                    if (temp.getEsquerda() == null) {
                        No auxiliar = new No(valor);
                        temp.setEsquerda(auxiliar);
                        return;
                    } else {
                        temp = temp.getEsquerda();
                    }

                } else {
                    if (temp.getDireita() == null) {
                        No auxiliar = new No(valor);
                        temp.setDireita(auxiliar);
                        return;
                    } else {
                        temp = temp.getDireita();
                    }
                }

            } while (true);
        }
    }

    // Questão A
    public int contarNosEsquerdaFestiva() {
        return contarNosEsquerdaFestivaRecursivo(raiz);
    }

    private int contarNosEsquerdaFestivaRecursivo(No no) {
        if (no == null) {
            return 0;

        }
        int cont = contarNosEsquerdaFestivaRecursivo(no.getEsquerda());
        if (no.getEsquerda() != null) {
            cont++;
        }
        return cont + contarNosEsquerdaFestivaRecursivo(no.getDireita());
    }

    // Questão B
    public void imprimirComRecuos() {
        imprimirComRecuosRecursivo(raiz, 0);
    }

    public void imprimirComRecuosRecursivo(No no, int nivel) {
        if (no == null) {
            for (int i = 0; i < nivel; i++) {
                System.out.print(" - ");
            }

            System.out.println();
            return;
        }
        // Recursivamente chama para a sub=arvore direita com um nivel de recuo maior
        imprimirComRecuosRecursivo(no.getDireita(), nivel + 1);

        // Imprime recuo proporcional ao nivel atual
        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }

        // Imprime o valor do no
        System.out.println(no.getValor());

        // Recursivamente chama para a sub-arvore esquerda com o mesmo nivel de recuo
        imprimirComRecuosRecursivo(no.getEsquerda(), nivel + 1);
    }
}

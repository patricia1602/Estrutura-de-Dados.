package arvore;

public class Main {
    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserindo elementos na arvore

        arvore.inserePrimeiroElemento(888);
        arvore.insereElemento(555);
        arvore.insereElemento(333);
        arvore.insereElemento(444);
        arvore.insereElemento(111);
        arvore.insereElemento(999);

        // Testando Parte A - Contagem de nós da esquerda festiva
        System.out.println("Número de nós da esquerda festiva: " + arvore.contarNosEsquerdaFestiva());

        // Testando Parte B - Impressão com recuos proporcionais ao nível do nó
        System.out.println("Impressão com recuos proporcionais ao nível do nó:");
        arvore.imprimirComRecuos();

    }
}

package atividade3;

public class Atividade3 {
    private int[] pares;

    public Atividade3(int quantidade) {
        this.pares = new int[quantidade];
        preencherPares();
    }

    public void preencherPares() {
        int valor = 2;
        for (int i = 0; i < pares.length; i++) {
            pares[i] = valor;
            valor += 2;
        }
    }
    public void exibirPares() {
        System.out.println("Exibindo com for tradicional:");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println("\n\nExibindo com for aprimorado (for-each):");
        for (int numero : pares) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}

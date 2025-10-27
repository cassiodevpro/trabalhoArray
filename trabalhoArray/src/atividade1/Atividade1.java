package atividade1;

public class Atividade1 {
    private int[] numeros;

    public Atividade1(int tamanho) {
        this.numeros = new int[tamanho];
        }

    public void preencher() {
        int valor = 1;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = valor++;
        }
    }

    public void mostrar() {
        for (int numero : numeros) {
            System.out.println("numero impresso: " + numero + " e posião do numero é: " + numeros);
        }
    }
}

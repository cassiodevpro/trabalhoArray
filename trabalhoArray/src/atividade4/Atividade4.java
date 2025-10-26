package atividade4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Atividade4 {
    private int[] pares = {5, 2, 8, 1, 9};

    public Atividade4() {
        this.pares = pares;
    }

    public int[] getPares() {
        return pares;
    }

    public void setPares(int[] setpares) {
        this.pares = pares;
    }
    public void exibirAtividade5(){
        Arrays.fill(this.pares, 10);

        System.out.println("Array preenchido atividade 5: " + Arrays.toString(getPares()));
    }

    public void exibiPares (int[] pares){

        Arrays.sort(getPares());
        System.out.print("Ordenado ");

        for (int n : this.pares) {

            System.out.print(n + " ");
        }
        System.out.println(" Não ordernado " +Arrays.toString(this.pares));
    }
}

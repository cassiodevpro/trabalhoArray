package atividade6;

import java.util.Arrays;

public class Atividade6 {
    private int[] tipoFill ={ 1, 2, 3, 4, 5} ;

    public Atividade6() {
        this.tipoFill = tipoFill;
    }

    public int[] getTipoFill() {
        return tipoFill;
    }

    public void setTipoFill(int[] tipoFill) {
        this.tipoFill = tipoFill;
    }

    public void exibirAtividade6(){
            Arrays.fill(this.tipoFill, 10);
            System.out.println("Array preenchido atividade 5: " + Arrays.toString(tipoFill));
        }



}

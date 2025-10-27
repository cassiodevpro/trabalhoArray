import atividade1.Atividade1;
import atividade2.Atividade2;
import atividade3.Atividade3;
import atividade4.Atividade4;
import atividade6.Atividade6;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        //  Atividade1
        Atividade1 atividate = new Atividade1(5);
        atividate.preencher();
        atividate.mostrar();

        // Atividade2
        Atividade2[] nomes = {
                new Atividade2("Carlos"),
                new Atividade2("Bruno"),
                new Atividade2("Ana")
        };
        Arrays.sort(nomes, (n1, n2) -> n1.getNome().compareToIgnoreCase(n2.getNome()));

        System.out.println("Nomes em ordem alfabética:");
        for (Atividade2 a : nomes) {
            System.out.println(a.getNome());
        }

        //Atividade 3
        Atividade3 pares = new Atividade3(10);
        pares.exibirPares();
        pares.preencherPares();

        //Atividade 4
        Atividade4 exibirPares = new Atividade4();
        exibirPares.exibiPares(exibirPares.getPares());

        //Atividade 5

        exibirPares.serachOito();



        //Atividade 6
        Atividade6 filtro = new Atividade6();
        filtro.exibirAtividade6();



    }
}

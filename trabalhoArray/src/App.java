import atividade1.Atividade1;
import atividade2.Atividade2;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Exemplo da Atividade1
        Atividade1 atividate = new Atividade1(5);
        atividate.preencher();
        atividate.mostrar();

        // Array de Atividade2 dentro do main
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
    }
}

package atividade2;

public class Atividade2 {
   private String[] nomes;

    public String[] getNomes() {
    return nomes;
}
   public void setNomes(String[] nomes) {
    this.nomes = nomes;
   }
    public Atividade2() {
        nomes = new String[3];
    }
    public void preencher() {
        nomes[0] = "Ana";
        nomes[1] = "Bruno";
        nomes[2] = "Carlos";    
    }
    private String nome;

    public Atividade2(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}

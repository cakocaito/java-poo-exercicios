public class Pessoa {
    private Pessoa pai;
    private Pessoa mae;
    private String nome;
    private int idade;

    public Pessoa(Pessoa pai, Pessoa mae, String nome, int idade) {
        this.pai = pai;
        this.mae = mae;
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

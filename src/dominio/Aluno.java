package dominio;

public class Aluno extends Pessoa {

    private String nome;
    private int idade;

    public Aluno(String cpf, int idade, String nome) {
        super(cpf);
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", cpf= " + getCpf() +
                '}';
    }
}

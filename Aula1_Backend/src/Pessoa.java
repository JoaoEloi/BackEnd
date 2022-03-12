import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    //Atributos
    private String nome;
    private String sobrenome;
    private LocalDate idade;
    private List<String> colecao = new ArrayList<>();

    //Construtor

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }


    //Getters e Setters
    //O this é usado para mostar que é o atributo da classe
    // que está sendo referenciado

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public List<String> getColecao() {
        return colecao;
    }

    public void setColecao(List<String> colecao) {
        this.colecao = colecao;
    }

    public List<String> adicionarNome(Pessoa pessoa) {
        //Aqui vem a lógica
        int var = pessoa.getNome().length();
        int idade = pessoa.idade();

        if(var >= 5 && idade >= 18) {
            colecao.add(pessoa.getNome());
            System.out.println(colecao);
        }
        return null;

    }

    //Método que calcula a idade
    public int idade() {
        int idade = Period.between(this.idade,
                LocalDate.of(2022,03,11)).getYears();
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
// Tentar de novo com a idade atualizada automaticamente
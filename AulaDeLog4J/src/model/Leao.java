package model;


import org.apache.log4j.Logger;

public class Leao {

    private static Logger logger = Logger.getLogger(Leao.class);
    private String nome;
    private int idade;
    private boolean eAlfa;

    //Construtor padrão
    //public Leao() {
    //}

    //Construtor parametrizado
    public Leao(String nome, int idade, boolean eAlfa) {
        this.nome = nome;
        this.idade = idade;
        this.eAlfa = eAlfa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean iseAlfa() {
        return eAlfa;
    }

    public void seteAlfa(boolean eAlfa) {
        this.eAlfa = eAlfa;
    }

    public void correr() {
        logger.info("O Leão " + nome + " está correndo");
    }

    public void eMaiorQue10() throws Exception{
        if (idade > 10 && iseAlfa()) {
            logger.info("O Leão " + nome + " tem mais de 10 anos!");
        }
        if (idade < 0) {
            //Log do Log4J
            logger.error("Idade inválida!");

            //Exception do java
            throw new Exception();
            //São diferentes e independentes entre si

        }
    }

}
